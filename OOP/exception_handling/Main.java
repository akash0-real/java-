package OOP.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){

    try{
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
    }
    catch(InputMismatchException e){
        System.out.println("That wasnt a number vroooo ");
    }

    catch(Exception e){
        System.out.println("Something went wrong!!");
    }
    }
   } 

   
}


