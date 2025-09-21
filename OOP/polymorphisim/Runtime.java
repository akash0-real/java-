package OOP.polymorphisim;

import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        int choice;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("would you like a dog or a car?(1 for dog/2 for cat): ");
            choice = scanner.nextInt();
        }
        Animal animal;
        switch(choice){
            case 1 -> {
                animal = new Dog();
                animal.speak();
            }
            case 2 -> {
                animal = new Cat();
                animal.speak();
            }
            
            default -> System.out.println("enter a vaild value!!");

        } 
        

        
    }
    
}

abstract class Animal{
    abstract void speak();
}

class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("the dog Braks baw baw!!");
    }
}

class Cat extends Animal{

    @Override
    void speak(){
        System.out.println("the cat goes meow moew!!");
    }
}