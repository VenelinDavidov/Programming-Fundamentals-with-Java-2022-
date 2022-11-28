package Final_Exam_Preparation_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogic_VII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //име на героя -> hp
        Map<String, Integer> heroesHP = new LinkedHashMap<>();

        //име на героя -> mp
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine()); //брой на героите
        for (int hero = 1; hero <=  countHeroes; hero++) {
            String heroInfo = scanner.nextLine(); //"Solmyr 85 120"
            //"Solmyr 85 120".split(" ") -> ["Solymur", "85", "120"]
            String [] heroData = heroInfo.split("\\s+"); //["Solymur", "85", "120"]
            String heroName = heroData[0]; //име на героя
            int hp = Integer.parseInt(heroData[1]); //хит точки на героя
            int mp = Integer.parseInt(heroData[2]); //мана точки на героя

            //проверка за hp -> hp <= 100
            if (hp <= 100) {
                //име на герой -> hp
                heroesHP.put(heroName, hp);
            }

            //проверка за mp -> mp <= 200
            if (mp <= 200) {
                //име на герой -> mp
                heroesMP.put(heroName, mp);
            }
        }
        //всеки един герой колко hp има (heroesHP)
        //всеки един герой колко mp има (heroesMP)

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("CastSpell")) {
                //1. command = "CastSpell – {hero name} – {MP needed} – {spell name}".split("\\s+-\\s+") -> ["CastSpell", "{hero name}", "{MP needed}", "{spell name}"]
                String heroName = command.split("\\s+-\\s+")[1]; //герой
                int mpNeeded = Integer.parseInt(command.split("\\s+-\\s+")[2]); //нужни точки за магията
                String spellName = command.split("\\s+-\\s+")[3]; //магията

                int currentMP = heroesMP.get(heroName); //mp на героя

                //1. да можем да направим магията -> текущотоMP >= mpNeeded
                if(currentMP >= mpNeeded) {
                    //ДА! ПРАВИМ МАГИЯ!
                    int mpLeft = currentMP - mpNeeded; //точки останали след направата на магията
                    heroesMP.put(heroName, mpLeft); //намаляме стойността на mp
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                }
                //2. НЕ правим магията -> текущотоMP < mpNeeded
                else {
                    //НE!!!
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            } else if (command.contains("TakeDamage")) {
                //2. command = "TakeDamage – {hero name} – {damage} – {attacker}".split("\\s+-\\s+") -> ["TakeDamage", "{hero name}", "{damage}", "{attacker}"]
                String heroName = command.split("\\s+-\\s+")[1]; //герой
                int damage = Integer.parseInt(command.split("\\s+-\\s+")[2]); //отнети точки
                String attacker = command.split("\\s+-\\s+")[3]; //атакуващия

                int currentHP = heroesHP.get(heroName);
                //атакa
                currentHP -= damage;

                //проверка дали е жив след атаката
                if (currentHP > 0) {
                    //жив
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    heroesHP.put(heroName, currentHP);
                } else {
                    //умрял
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroesHP.remove(heroName);
                    heroesMP.remove(heroName);
                }

            } else if (command.contains("Recharge")) {
                //3. command = "Recharge – {hero name} – {amount}".split("\\s+-\\s+") -> ["Recharge", "{hero name}", "{amount}"]
                String heroName = command.split("\\s+-\\s+")[1]; //име на героя
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]); //количество за възстановяване (MP)

                int currentMP = heroesMP.get(heroName);
                //възстановяване на точки
                currentMP += amount;

                if (currentMP > 200) {
                    currentMP = 200;
                }

                //с колко се е увеличило: увеличеното - първоначалното
                System.out.printf("%s recharged for %d MP!%n", heroName, currentMP - heroesMP.get(heroName));
                heroesMP.put(heroName, currentMP);

            } else if (command.contains("Heal")) {
                //4. command = "Heal – {hero name} – {amount}".split("\\s+=\\s+)" -> ["Heal", "{heroName}", "{amount}"]
                String heroName = command.split("\\s+-\\s+")[1]; //име на героя
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]); //количество за възстановяване (hp)

                int currentHP = heroesHP.get(heroName);
                //възстановявам
                currentHP += amount;

                if (currentHP > 100) {
                    currentHP = 100;
                }

                //с колко се е увеличило: увеличеното - първоначалното
                System.out.printf("%s healed for %d HP!%n", heroName, currentHP - heroesHP.get(heroName));
                heroesHP.put(heroName, currentHP);
            }
            command = scanner.nextLine();
        }

        //heroesHP: име на герой -> hp
        //heroesMP: име на герой -> mp

        heroesHP.entrySet()
                //име на герой (key) -> hp (value)
                .forEach(entry -> {
                    String heroName = entry.getKey();
                    System.out.println(heroName);
                    System.out.println(" HP: " + entry.getValue());
                    System.out.println(" MP: " + heroesMP.get(heroName));
                });

    }
}