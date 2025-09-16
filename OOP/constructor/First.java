package OOP.constructor;
public class First{
    public static void main(String[] args){
        Car one = new Car("Audi",4,"red");
        one.result();
    }

}

class Car{
    String name;
    int seats;
    String color;

    Car(String name,int  seats,String color) {
        this.name = name;
        this.seats = seats;
        this.color = color;
    }

    void result(){
        System.out.println("The Car name is " + name + ". Seats: " + seats + " and color: " + color);
    }
    
    

}
