package OOP.constructor;
import java.util.Random;
 import java.util.Scanner;
  public class third{
     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Bank one = new Bank(scanner); 
        one.display(); scanner.close(); 
    } } 
class Bank{ 
    int bankacc; 
    String name; 
    int intitial_deposit; 
    Bank(Scanner scanner){ 
        Random bankcard = new Random(); 
        this.bankacc = bankcard.nextInt(10); 
        System.out.print("enter your name: "); 
        this.name = scanner.nextLine(); 
        System.out.print("enter intial depoist: "); 
        this.intitial_deposit = scanner.nextInt(); 
        scanner.nextLine(); 
    } 
    void display(){ 
        System.out.println("your bank account number is: " + bankacc); 
        System.out.println("your name is: " + name); 
        System.out.println("intial depoist is: " + intitial_deposit); } 
    }
    
