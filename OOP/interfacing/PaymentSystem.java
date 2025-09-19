package OOP.interfacing;

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();
        Upi upi = new Upi();
        try(Scanner Scanner = new Scanner(System.in)){
            System.out.println("enter the paying method: ");
            System.out.print("1 for cred/2 for debit/3 for Upi: ");
            int choice = Scanner.nextInt();
            switch (choice){
                case 1 -> creditCard.pay();
                case 2 -> debitCard.pay();
                case 3 -> upi.pay();
                default -> System.out.println("enter a valid input!!");
            }
        
    
    }
    }
    
}

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("You are paying via Credit card!");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("you are paying via debit card!!");
    }
}

class Upi implements Payment{
    @Override
    public void pay(){
        System.out.println("you are paying via Upi");
    }
}