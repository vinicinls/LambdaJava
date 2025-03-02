package application;

import entities.Product;
import model.services.ProducService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program4 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV",900.0));
        products.add(new Product("BV",100.0));
        products.add(new Product("AV",220.0));
        products.add(new Product("AV",800.0));
        products.add(new Product("TV",2300.0));
        products.add(new Product("BV",400.0));


        ProducService ps = new ProducService();

        double sum = ps.filterSum(products,x -> x.getName().charAt(0) == 'T');

        System.out.println(sum);



    }
}
