package OOP.getters_setters;

public class First {
    public static void main(String[] args) {
        Car car = new Car("ford", "black", 100000);
        System.out.println(car.getColor() + " " + car.getName() + " " + car.getPrice());
    }
    
}


class Car{
    private String name;
    private String color;
    private int price;
    Car(String name,String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    String getName(){
        return this.name;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return  "$" + this.price;
    }
}
