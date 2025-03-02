package util;

import entities.Product;

import java.util.function.Function;

public class UpperCase implements Function<Product,String> {

    @Override
    public String apply(Product product) {
        return "Product{" + "name='" + product.getName().toUpperCase() + "', price=" + product.getPrice() +"}";
    }
}
