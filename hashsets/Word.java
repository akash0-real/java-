package hashsets;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try{
                Unique unique = new Unique();
                unique.input(scanner);
                unique.display();
                unique.word_check(scanner);
            }catch(InputMismatchException e){
                System.out.println("wrong input!!");
            }
        }

    }
    
}

class Unique{
    HashSet<String> one = new HashSet<>();
    int total = 0;

    void input(Scanner scanner){
        System.out.println("enter how many word do you want to enter: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<choice;i++){
            System.out.println("Enter the word: ");
            String name = scanner.nextLine().trim().toLowerCase();
            one.add(name);
            total++;
        }
        
    }
    void display(){
        System.out.println("Total words were: " + total);
        System.out.println("unique words are: " + one.size());
    }

    void word_check(Scanner scanner) {
        System.out.println("Enter the word do you want to check: ");
        String word = scanner.nextLine().toLowerCase();
        if(one.contains(word)){
            System.out.println("the " + word + " is in sets!!");
        }
        else{
            System.out.println("coudlnt found the word!!");
        }
    }
}