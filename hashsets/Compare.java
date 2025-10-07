package hashsets;

import java.util.HashSet;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Arr arr = new Arr();
            arr.input(scanner);
            arr.compare();
        
        }
    
    }
    
}

class Arr{
    HashSet<Integer> one = new HashSet<>();
    HashSet<Integer> two = new HashSet<>();

    void input(Scanner scanner){
        System.out.println("Enter how many enter do you want to enter in first set: ");
        int number = scanner.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Enter: ");
            int choice = scanner.nextInt();
            one.add(choice);
        }

        System.out.println("Enter how many elements do you want in second set: ");
        int Second = scanner.nextInt();
        for(int i=0;i<Second;i++){
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            two.add(value);
        }
    }

    void compare(){
        one.retainAll(two);
        System.out.println(one);

    }


}