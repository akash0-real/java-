package projects;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Welcome to akash restaurant!!");
            Menu menu = new Menu();
            menu.display();
            try{
                System.out.print("Enter the food you want to eat!!!: ");
                String choice = scanner.nextLine();
                Order order = Order.valueOf(choice.toLowerCase());
                System.out.print("enter the quantity: ");
                int quan = scanner.nextInt();
                scanner.nextLine();
                switch (order){
                    case burger, pizza, chicken_wings, dosa, tacos, rice_bowl -> order.order(quan);

                }
                Payment payment;
                System.out.print("Enter the payment method you want to use(1 for cards/2 for wallet/3 for Upi): ");
                int pay = scanner.nextInt();
                scanner.nextLine();
                switch (pay){
                    case 1 -> {
                        payment = new Card();
                        payment.pay(order.price*quan);
                    }
                    case 2 -> {
                        payment = new Wallet();
                        payment.pay(order.price*quan);
                    }
                    case 3 -> {
                        payment = new Upi();
                        payment.pay(order.price*quan);
                    }
                }
                Status[] status = {Status.preparing,Status.ready,Status.delivery};
                for(Status one: status){
                    one.display();
                }



        }catch (IllegalArgumentException e){
                System.out.println("Wrong input!!");
            }
            catch (InputMismatchException e){
                System.out.println("wrong input!!");
            }
        }
        
    }
}
class Menu{
    String[] arr = {"burger","pizza","chicken_wings","dosa","tacos","rice_bowl"};
    void display(){
        System.out.println("Menus items are: ");
        for(String one: arr){
            System.out.println(one);
        }
    }
}

enum Order{
    burger(100), pizza(220), chicken_wings(120), dosa(80), tacos(50), rice_bowl(60);
    public final int price;
    Order(int price){
        this.price = price;
    }
    void order(int quan){
        System.out.println("Order confirmed!");
        System.out.println("your order of " + this.name() + " has been placed!!");
        System.out.println("the total price will be: $" + price*quan);


    }

}

enum Status{
    preparing(10), ready(0), delivery(20);
    private final int time;
    Status(int time){
        this.time = time;
    }

    void display(){
        System.out.println("your order status is: " + this.name());
        System.out.println("the time remaining is: " + time + " min");
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            System.out.println("Order tracking interrupted!");
        }
        if(this == delivery){
            System.out.println("your order has been delivered!!");
        }
    }
}

interface Payment{
    void pay(int price);
}

class Card implements Payment{
    @Override
    public void pay(int price){
        System.out.println("you are paying " + price + " via debit/credit card!!!");
    }
}

class Wallet implements Payment{
    @Override
    public void pay(int price){
        System.out.println("you are paying " + price + " via wallet!!");
    }
}

class Upi implements Payment{
    @Override
    public void pay(int price){
        System.out.println("you are paying " + price + " via Upi!!");
    }
}
