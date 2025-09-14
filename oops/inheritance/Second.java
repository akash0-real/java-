package oops.inheritance;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Dog one = new Dog(scanner);
       one.first();
       one.second();
       one.third();
       scanner.close(); 
    }
    
}

class Animal{
    String name;
    int age;

    Animal(Scanner scanner) {
        System.out.print("enter the name of the animal: ");
        this.name = scanner.nextLine();
        System.out.print("enter its age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        
       
    }
   void first(){
    System.out.println("Animal name is: " + name + ". and age is : " + age);
   } 
}

class Mamal extends Animal{

    Mamal(Scanner scanner) {
        super(scanner); 
    }
    void second(){
        System.out.println(name + " has fur.");
    }
    
}

class Dog extends Mamal{
    Dog(Scanner scanner){
        super(scanner);
    }
    void third(){
        System.out.println(name + " barks woff woff...");
    }

}