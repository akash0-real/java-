package OOP.abstraction;

import java.util.Scanner;

public class Banking_system{
   public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
        int account;
        double balance;
        System.out.print("enter your account number: ");
        account = scanner.nextInt();
        System.out.print("enter your balance: ");
        balance = scanner.nextDouble();
        Saving saving = new Saving(account, balance);
        Current current = new Current(account, balance);
        System.out.print("enter your account type: (1 for saving and 2 for current)");
        int choice = scanner.nextInt();
        
        if(choice ==1){
            saving.intrest();
            System.out.print("Do u want to deposit or withdraw?(1 for deposit and 2 for withdraw): ");
            int chance = scanner.nextInt();
            if(chance==1){
                saving.depoist(scanner);
            }
            else if(chance ==2){
                saving.withdraw(scanner);
            }
            else{
                System.out.println("enter a valid input");
            }
        }
        else if(choice == 2){
            current.intrest();
            System.out.print("Do u want to deposit or withdraw?(1 for deposit and 2 for withdraw): ");
            int chance = scanner.nextInt();
            if(chance==1){
                current.depoist(scanner);
            }
            else if(chance ==2){
                current.withdraw(scanner);
            }
            else{
                System.out.println("enter a valid input");
            }
        }
        else{
            System.out.println("enter a valid input!!!");
        }

    }
    
   } 
}

abstract class Account{
    int account;
    double balance;

    public Account(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }
    

    abstract void intrest();

    void depoist(Scanner scanner){
        System.out.print("enter the amount: ");
        double depoist = scanner.nextDouble();
        balance += depoist;
        System.out.println("the balance is: " + balance);
    }
    void withdraw(Scanner scanner){
        System.out.print("enter the amount you want to withdraw: ");
        double withdraw = scanner.nextDouble();
        if(withdraw>balance){
            System.out.println("you dont have enough money!");
        }
        else{
            balance -= withdraw;
            System.out.println("the balance is: " + balance);
        }
    }
        
    

}

class Saving extends Account{
    Saving(int account,double balance) {
        super(account,balance);
    
    }
    @Override
    void intrest(){
        balance = balance + (balance*0.04);
        System.out.println("the balance is " + balance);
    }

    
}

class Current extends Account{
    Current(int account,double balance) {
        super(account,balance);
    
    }
    @Override
    void intrest(){
        System.out.println("your balance is " + balance);
    }
}
