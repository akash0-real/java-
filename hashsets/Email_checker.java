package hashsets;

import java.util.HashSet;
import java.util.Scanner;

public class Email_checker {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Email email = new Email();
            email.input(scanner);
            email.display();

        }

    }
    
}

class Email{
    HashSet<String> valid_email = new HashSet<>();
    HashSet<String> reject_email = new HashSet<>();
    int total_email;
    String email = "@gmail.com";

    void input(Scanner scanner){
        System.out.print("how many emails do you want to enter: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<choice;i++){
            System.out.print("Enter the email: ");
            String name = scanner.nextLine();
            if(name.endsWith(email)){
                valid_email.add(name);
                
            }
            else{

                reject_email.add(name);
            }

            total_email++;
        }
        

    }

    void display(){
        System.out.println("total emails: " + total_email);

        System.out.println("valid email: " + valid_email.size());
        System.out.println("rejected email: " + reject_email.size());
        System.out.println();

        System.out.println("Valid emails are: " + valid_email);
        System.out.println("rejected emails are: " + reject_email);
        

    }




}
