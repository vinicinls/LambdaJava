package model.services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProducService{


    public double filterSum(List<Product> list, Predicate<Product> criterio){
        double sum=0.0;
        for (Product p : list){
            if (criterio.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }


}
