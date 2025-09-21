package OOP.polymorphisim;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike  = new Bike();
        Boat boat = new Boat();
        
        Vehicle[] one = {car,bike,boat};
        for(Vehicle vehicle: one){
            vehicle.go();
        }
        
    }
    
}

abstract class Vehicle{

    abstract void go();

}

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("you drive the car!!");
    }
}

class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("you dive a bike!!");
    }
}

class Boat extends Vehicle{

    @Override
    void go(){
        System.out.println("you Sail the boat!!");
    }
}
