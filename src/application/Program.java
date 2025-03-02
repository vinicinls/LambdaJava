package application;

import entities.Product;
import util.ProductPredicate;

import java.util.*;
import java.util.function.Predicate;

public class Program {

   /* public static double compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }*/

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mesa", 90.0));
        list.add(new Product("cadeira", 41.0));
        list.add(new Product("iphone", 6100.0));


        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));

        list.forEach(obj -> System.out.println(obj));





        //list.removeIf(Product::staticProductPredicate);

        //list.removeIf(Product::nonStaticProductPredicate);


        //Predicate<Product> pred = p -> p.getPrice() >=100;

        //list.removeIf(new ProductPredicate());

        //list.removeIf(p -> p.getPrice() <= 100);

        list.removeIf(p -> p.getPrice() >= 100);
        System.out.println("depois");
        //list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);


        }

    }



