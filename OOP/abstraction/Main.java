package OOP.abstraction;

public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(20,5);
        Rectangle rectangle = new Rectangle(2.3,5);
        System.out.println(circle.area());
         System.out.println(triangle.area());
          System.out.println(rectangle.area()); 
    }
}
abstract class Shape {
        abstract double area();
        void display(){
            System.out.println("this is a shape!");
        }
        
    }
    

class Circle extends Shape{
    double radius;    
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return (Math.PI * radius * radius);
    }
}
class Triangle extends Shape{
    double base;
    double height;   

    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5*base*height;
    }
}
class Rectangle extends Shape{
    double length;
    double breath;
    
    public Rectangle(double length,double breath) {
        this.length = length;
        this.breath = breath;
    }
    @Override
    double area(){
        return length*breath;
    }
}
