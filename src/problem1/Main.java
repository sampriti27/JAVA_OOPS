package problem1;
/*
Create a class hierarchy to represent different geometric shapes, such as Circle, Rectangle, and Triangle.
Each shape should have properties like area and perimeter, and should implement a common interface Shape with methods
 to calculate area and perimeter. Demonstrate polymorphism by creating instances of different shapes, calculating
 their areas and perimeters, and displaying the results.
*/
interface Shape{
    public double calculatePerimeter();
    public double calculateArea();
}
class Circle implements Shape{
   private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double calculatePerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape{
    double length;
    double breadth;
    public Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public double calculatePerimeter() {
            return 2*(length + breadth);
    }
}
public class Main {
    public static void main(String args[]){
        Circle c = new Circle(3);
        System.out.println( c.calculateArea());
        System.out.println(c.calculatePerimeter());
        Rectangle r = new Rectangle(2,3);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
    }
}
