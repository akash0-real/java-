package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){
        Cart cart = new Cart();
        cart.add(scanner);
        cart.display();
        
    }}
}

class Product{
    String name;
    String category;
    Double price;
    int quantity;
    Product(String name,String category,Double price,int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    void getName(){
        System.out.println(name);
    }

    void getCategory(){
        System.out.println(category);
    }
    void getPrice(){
        System.out.println(price);
    }
    void getQuantity(){
        System.out.println(quantity);
    }

    void setPrice(){
        this.price = price;
    }

}

class Cart{
    private final HashMap<Integer, Product> map = new HashMap<>();

    //to add the new values!!

    void add(Scanner scanner){
        System.out.print("Enter how many Products do you want to enter: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<amount;i++){
            System.out.print("Enter the id of the product: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the name of the product: ");
            String name = scanner.nextLine();
            System.out.print("Enter the category: ");
            String category = scanner.nextLine();
            System.out.print("Enter the price: ");
            Double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            map.put(id,new Product(name, category, price, quantity));
            

            
        }
    }
    //to remove the value!!

    void remove(Scanner scanner){
        System.out.println("Enter the name of the productid to remove: ");
        int pid = scanner.nextInt();
        if(map.containsKey(pid)){
            map.remove(pid);
            System.out.println("The product is removed!");
        }
        else{
            System.out.println("Couldnt remove the product!!");
        }
    }
    // to display the values!!

    void display(){
        
    }


    

}
