package application;

import entities.Product;
import util.UpdatePrice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mesa", 90.0));
        list.add(new Product("cadeira", 80.90));
        list.add(new Product("iphone", 6100.0));

        //list.forEach(new UpdatePrice());

        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

        //list.forEach(Product::updatePrice);

       // list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));


        list.sort((p1,p2) -> p1.getName().toUpperCase()
                .compareTo
                        (p2.getName().toUpperCase()));

        //list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));

        list.forEach(x -> System.out.println(x));




    }

}
