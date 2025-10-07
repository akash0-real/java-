package hashsets;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Friend {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try {
                Hash hash = new Hash();
                hash.input(scanner);
                hash.recco();
            } catch (InputMismatchException e) {
                System.out.println("wrong input!!");
            }   
        }
    }
}

class Hash{
    HashSet<String> one = new HashSet<>();
    HashSet<String> two = new HashSet<>();

    void input(Scanner scanner){
        System.out.println("you are number one!!");
        System.out.print("how many close friends do u have? : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<choice;i++){
            System.out.print("Enter the name of your friend: ");
            String name = scanner.nextLine().toLowerCase();
            one.add(name);
        }

        System.out.println();
        System.out.println("you are number two!!");
        System.out.print("how many friends do you have? : ");
        int value = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<value;i++){
            System.out.print("Enter the name of your friend: ");
            String second_name = scanner.nextLine().toLowerCase();
            two.add(second_name);
        }

    }

    void recco(){
        System.out.println("number one friends: " + one);
        System.out.println("number two friends: " + two);

        HashSet<String> three = new HashSet<>(one);
        three.retainAll(two);
        System.out.println("mutal: " + three);

        HashSet<String> sugg_one = new HashSet<>(two);
        sugg_one.removeAll(one);

        HashSet<String> sugg_two = new HashSet<>(one);
        sugg_two.removeAll(two);



        System.out.println("suggestion for one: " + sugg_one);
        System.out.println("suggestion for two: " + sugg_two);

    }
}
