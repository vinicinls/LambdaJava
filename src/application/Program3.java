package application;

import entities.Product;
import util.UpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Locale.setDefault(Locale.US);

        products.add(new Product("tv",90.0));
        products.add(new Product("mesa",90.0));
        products.add(new Product("banco",90.0));


        products.forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        //Método por função na classe UpperCase
        //List<String> list = products.stream().map(new UpperCase()).collect(Collectors.toList());


        //Método static
        //List<String> list = products.stream().map(Product::staticUpperCase).collect(Collectors.toList());

        //Método não static
        //List<String> list = products.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());

        //expressao lambda
        //Function<Product,String> func = x -> x.getName().toUpperCase();
        //List<String> list = products.stream().map(func).collect(Collectors.toList());

        //lambda inline
        List<String> list = products.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());



        list.forEach(System.out::println);








    }
}
