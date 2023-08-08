package problem2;
/*Design a class structure for an online store system. You need to create a base class called Product, with properties
like name, price, and category. Subclasses such as Electronics, Clothing, and Books should inherit from Product.
Implement an interface called Discountable with a method applyDiscount(), and apply it to one of the subclasses.
 Create a main program to demonstrate polymorphism by calculating and displaying the discounted prices of
 various products.
 */
interface Discountable{
    public double applyDiscount(int percent);
}
class Product{
    String name;
    int price;
    String category;
    public Product(){

    }
    public Product(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
class Electronics extends Product implements Discountable{
    public Electronics(String name, int price, String category){
        super(name, price, category);
    }

    @Override
    public double applyDiscount(int percent) {
        double discountAmt = (percent/100.0)*super.price;
        return super.price-discountAmt;
    }
}
class Clothing extends Product{
    public Clothing(String name, int price, String category){
        super(name, price, category);

    }
}
class Books extends Product{
    public Books(String name, int price, String category){
        super(name, price, category);
    }
}
public class Main {
    public static void main(String args[]){
        Clothing cl = new Clothing("Pant", 50, "bottom");
        Electronics e = new Electronics("TV", 500, "xyz");
        System.out.println(e.applyDiscount(10));
    }
}
