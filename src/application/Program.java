package application;

import entities.Product;

import java.util.*;

public class Program {

   /* public static double compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }*/

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mesa", 1100.0));
        list.add(new Product("Mesa", 4100.0));
        list.add(new Product("Mesa", 6100.0));

        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        list.forEach(System.out::println);

        double sum = list.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(sum);



        }

    }



