package OOP.methods;

public class ToString {
    public static void main(String[] args) {
        Car car = new Car("bmw", 3, "suv");
        System.out.println(car);

    }
}

class Car{
    String name;
    int seats;
    String type;
    Car(String name,int seats,String type){
        this.name = name;
        this.seats = seats;
        this.type = type;
    }
    @Override
    public String toString(){
        return this.name + " " + this.seats + " " + this.type;
    }
}
