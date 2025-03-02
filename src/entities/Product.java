package entities;

public class Product{
    private String name;
    private Double price;

    public Product(){

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }


    public boolean nonStaticProductPredicate(){
        return price >= 100;
    }


    public static void updatePrice(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }


    public static String staticUpperCase(Product p){
        return p.getName().toUpperCase() + " " + p.getPrice();
    }

    public String nonStaticUpperCase(){
        return name.toUpperCase() + " " + price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f",price) +
                '}';
    }

}
