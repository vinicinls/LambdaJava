package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

            list.add(new Product("mesa",1000.0));
            list.add(new Product("banco",1000.0));
            list.add(new Product("tv",1000.0));
            list.add(new Product("quadro",1000.0));
            list.add(new Product("armario",1000.0));

            list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

            System.out.println(list.size());
            System.out.println("-------------");

            for (Product p : list){
                System.out.println(p);
            }

    }
}
