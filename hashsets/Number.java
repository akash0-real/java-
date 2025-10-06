package hashsets;

import java.util.HashSet;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Guess random = new Guess();
            random.input(scanner);
            random.display();
            random.search(scanner);
            random.show();
        }
        
    }
}
class Guess {
    HashSet<Integer> one = new HashSet<>();

    void input(Scanner scanner){
            System.out.println("Enter ten values!!");
            for(int i=0;i<10;i++){
                System.out.print("Enter " + i+1 + " number: ");
                int number = scanner.nextInt();

                one.add(number);
            }
        }
        void display(){
            System.out.println("total number entered: " + "10");

            System.out.println("Current number: " + one.size());
        }

        void search(Scanner scanner){
            System.out.println("Enter a number to search: ");
            int choice = scanner.nextInt();
            if(one.contains(choice)){
                System.out.println("the number " + choice + " exits!!");
            }
            else{
                System.out.println("it doesnt exits!!");
            }
        }

        void show(){
            for(int two:one){
                System.out.println(two);
            }
        }
    }