package oops.Constructor; 
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("This is a delivery service!");
        System.out.print("your you want to only enter name and email or address or phone(1 for name and email/2 for phone/3 for address details): ");
        choice = scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            Name one = new Name(scanner);
            one.display();
        } else if (choice == 2) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your phone: ");
            String phone = scanner.nextLine();
            Name one = new Name(name,email,phone);
            one.display_phone();
        } else if (choice==3) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your phone: ");
            String phone = scanner.nextLine();
            System.out.print("Enter your address: ");
            String address = scanner.nextLine();
            Name one = new Name(name,email,phone,address);
            one.display_address();
        }
        else {
            System.out.println("enter valid value!.");
        }
        scanner.close();
    }
}

class Name{
    String name;
    String email;
    String phone;
    String address;
    Name(Scanner scanner){
        System.out.print("enter your full name: ");
        this.name = scanner.nextLine();
        System.out.print("enter your email: ");
        this.email = scanner.nextLine();
    }
    Name(String name,String email,String phone){
        this.email = email;
        this.name  = name;
        this.phone = phone;
    }
    Name(String name,String email,String phone,String address){
        this(name,email,phone);
        this.address = address;
    }
    void display(){
        System.out.println("your name is: " + name + ".Your email is: " + email);
    }
    void display_phone(){
        System.out.println("your name is: " + name + ".Your email is: " + email + ". your phone number is " + phone);
    }
    void display_address(){
        System.out.println("your name is: " + name + ".Your email is: " + email + ". your phone number is " + phone + ". your address is: " + address);
    }
}