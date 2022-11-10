package MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //продукт -> обща цена (бр * ед. цена)
        Map<String, Double> productsPrice = new LinkedHashMap<>(); //продукт -> ед. цена
        Map<String, Integer> productsQuantity = new LinkedHashMap<>(); //продукт -> брой

        while(!input.equals("buy")) {
            //"Beer 2.20 100" -> split(" ") -> ["Beer", "2.20", "100"]
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(product, pricePerProduct);

            if(!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            //key (име на продукта) -> value (цена)
            //цена * количеството
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}