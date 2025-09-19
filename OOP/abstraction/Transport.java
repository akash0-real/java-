package OOP.abstraction;

public class Transport {
   public static void main(String[] args) {
    Car car = new Car("bmw", 1000);
    Bike bike = new Bike("honda", 1000);
    car.display();
    car.start();
    car.fuel_usage();
    car.stop();
    bike.display();
    bike.start();
    bike.fuel_usage();
    bike.stop();
    
   } 
}

abstract class Vehicle{
    abstract void start();
    abstract void stop();
    void fuel_usage(){
        System.out.println("it consumed 2 litre fuel!");
    }
}

class Car extends Vehicle{
    String name;
    int price;
    Car(String name,int price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println("the name of the car is: " + name + ". The price of the car is: " + price);
    }
    @Override
    void start() {
        System.out.println("The car is starting... ");
        
    }
    @Override
    void stop(){
        System.out.println("the car is stopping...");
    }
}


class Bike extends Vehicle{
    String name;
    int price;
    Bike(String name,int price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println("the name of the bike is: " + name + ". The price of the bike is: " + price);
    }

    @Override
    void start() {
        System.out.println("The bike is starting... ");
        
    }
    @Override
    void stop(){
        System.out.println("the bike is stopping...");
    }
}
