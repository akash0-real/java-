package projects;

import java.util.Scanner;

public class Banking {
   public static void main(String[] args) {
    // using try for Scanner to help with better memory managment!
    try(Scanner scanner = new Scanner(System.in)){
        // using try to catch typing errors!
        try{
            double balance;
            System.out.println("Welcome to the bank!!!!");
            System.out.println("Enter your balace");
            balance = scanner.nextDouble();


            //staring with first enum class with this!
            System.out.println("Select the Account type(1 for current/2 for saving/3 for fixed): ");
            int choice = scanner.nextInt();
            
            //used switch for enums!
            switch(choice){
                case 1-> Account.current.show("current", balance);
                case 2 -> Account.saving.show("saving", balance);
                case 3 -> Account.fixed.show("fixed", balance);
                default -> System.out.println("Enter a valid value!!!");
        
            }

            System.out.println("After intrest...");
            // staring doing runtime polymorphisim from here. Calling abstract class.

            Money money;
            
            switch(choice){
                case 1 -> {
                    money = new Current();
                    money.display(balance);
                    money.trans(scanner, balance);
                }
                case 2 -> {
                    money = new Saving();
                    money.display(balance);
                    money.trans(scanner, balance);
                }
                case 3 -> {
                    money = new Fixed();
                    money.display(balance);
                    money.trans(scanner, balance);
                }
            }
            

    
        }
        // to catch users wrong input and illegal arguments!!
        catch(IllegalArgumentException e){
            System.out.println("enter a valid value!!!!");

        }

    }
    
   } 
}

//enum class which stores names of the accounts!!
enum Account{
    current("current_account"), saving("saving_account"),fixed("fixed_account");
    public final String acc_name;
    Account(String acc_name) {
        this.acc_name = acc_name;
        
    }
    void show(String acc_number, double balance){
        System.out.println("you have selected " + this.acc_name);
        System.out.println("your current balance is " + balance);
    }
}

// abstract class to store our default methods
abstract class Money{
     abstract void display(double balance);
     abstract void trans (Scanner scanner, double balance);
}

// calss for current account which is using abstract!
class Current extends Money{
    @Override
    void display(double balance){
        System.out.println("Your current account is " + balance);
    }

    @Override
    void trans(Scanner scanner,double balance){
        System.out.println("Do u want to depoist or withdraw(1 for depoist/2 for withdraw): ");
        int choice = scanner.nextInt();
        switch(choice){// switch method for depoist or withdraw of money!!
            case 1 -> {
                System.out.println("enter the amount do you want to deposit: ");
                double depoist = scanner.nextDouble();
                balance = balance + depoist;
                System.out.println("your balance now is " + balance);
            }
            case 2 -> {
                System.out.println("Enter the amount do you want to withdraw: ");
                double withdraw = scanner.nextDouble();
                if(withdraw>balance){// to check if withdraw is larger than out balance
                    System.out.println("Insufficient funds!!");
                }
                else{
                    balance = balance-withdraw;
                    System.out.println("your current balance is: " + balance);
                }
            }
            default -> System.out.println("Enter a valid value!!");
        }

        

    }
    
}

class Saving extends Money{

    @Override
    void display(double balance){
        balance =  balance + (balance*0.4);
        System.out.println("your current balance is " + balance);
    }
    @Override
    void trans(Scanner scanner, double balance){
         System.out.println("Do u want to depoist or withdraw(1 for depoist/2 for withdraw): ");
            int choice = scanner.nextInt();
            switch(choice){// again same to check wheather user is asking for depoist or withdrawal!
                case 1 -> {
                    System.out.println("enter the amount do you want to deposit: ");
                    double depoist = scanner.nextDouble();
                    balance = balance + depoist;
                    System.out.println("your balance now is " + balance);
            }
                case 2 -> {
                    System.out.println("Enter the amount do you want to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if(withdraw>balance){// to check if withdraw if larger than balance
                    System.out.println("Insufficient funds!!");
                }
                else{
                    balance = balance-withdraw;
                    System.out.println("your current balance is: " + balance);
                }
            }
                default -> System.out.println("Enter a valid value!!");
        }

    }
}

class Fixed extends Money{
    @Override
    void display(double balance){
        balance = balance + (balance*0.75);
        System.out.println("your balance is: " + balance);
    }
    @Override
    void trans(Scanner scanner, double balance){
        System.out.println("Do u want to depoist or withdraw(1 for depoist/2 for withdraw): ");
            int choice = scanner.nextInt();
            switch(choice){//again same 
                case 1 -> {
                    System.out.println("enter the amount do you want to deposit: ");
                    double depoist = scanner.nextDouble();
                    balance = balance + depoist;
                    System.out.println("your balance now is " + balance);
                }
                case 2 -> System.out.println("This is a fixed account,Cant withdraw!!");// now it is fixed account so user cant withdraw from it!!

                default -> System.out.println("wrong input!!!");

    }
    
    }

}