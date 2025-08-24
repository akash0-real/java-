package oops;
import java.util.Scanner;

public class parking{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Parking_lot first = new Parking_lot(scanner);
        first.result();
        first.display();
        scanner.close();
    }
}


class Parking_lot{
    int price=3;
    int hours;

    public Parking_lot(Scanner scanner) {
        System.out.println("This is a parking lot for 24hrs only!");
        System.out.println("The prices are: ");
        System.out.println("three dollar for every hour");
        System.out.print("Enter how many hours you wanna park! (only in numbers): ");
        this.hours = scanner.nextInt();
        
    }
    
    int result(){
        if(hours<=1){
            price = 3;
        }
        else{
            price *= hours;
        }
        return price;        
    }
    void display(){
        System.out.println("Your Total price is: " + price +"$");

    }
}