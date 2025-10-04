package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){
        Cart cart = new Cart();
        boolean run = true;
        while(run){
            System.out.println("Welcome to Supermarket Inventory!!! ");
            System.out.println();
            System.out.println("Menu.....");
            System.out.println("1. for add!");
            System.out.println("2. for remove!");
            System.out.println("3. for display!!");
            System.out.println("4. for Update quantity!!");
            System.out.println("5. for Search by name!!");
            System.out.println("6. for View by category!!");
            System.out.println("7. for Low stock alert!!");
            System.out.println("8. for Sort the products!!");
            System.out.println("9. for Total Money!!");
            System.out.println("10. for exit!!");
            System.out.print("Enter: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 ->{
                    cart.add(scanner);
                }

                case 2 -> {
                    cart.remove(scanner);
                }
                case 3 -> {
                    cart.display();
                }
                case 4 -> {
                    cart.update(scanner);
                }
                case 5 -> {
                    cart.search(scanner);
                }
                case 6 -> {
                    cart.view(scanner);
                }
                case 7 -> {
                    cart.low(scanner);
                }
                case 10 -> {
                    System.out.println("Exiting...");
                    System.out.println("bye...");
                    run = false;
                }
                default -> {
                    System.out.println("Enter the valid input!!");
                }
            }
        }
        
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

    String getName(){
        return name;
    }
    String getCategory(){
        return category;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }

    int setQuantity(int quantity){
        return this.quantity = quantity;
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
        if(map.isEmpty()){
            System.out.println("There is no products!!");
        }
        else{
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
    }

    // to display the values!!

    void display(){
        if(map.isEmpty()){
            System.out.println("There is no products to display!!");
            return;
        }

        for(int keys: map.keySet()){
            Product p = map.get(keys);
            System.out.println("Id: " + keys + ", name: " + p.getName() + ", categoty: " + p.getCategory() + ", price: " + p.getPrice() + ", quantity: " + p.getQuantity());
        }
        
    }

    // to change the quantity according to the user!!
    void update(Scanner scanner){
        if(map.isEmpty()){
            System.out.println("there is no products!!");
            return;
        }

        System.out.println("Enter the product_Id: ");
        int p_id = scanner.nextInt();
        scanner.nextLine();

        if(!map.containsKey(p_id)){
            System.out.println("wrong product id!!");
            return;
        }

        Product one = map.get(p_id);

        System.out.print("Do you want to add or remove the the quantity?(1 for add/ 2 for remove): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter the amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1 -> {
                one.setQuantity(one.getQuantity()+amount);
                System.out.println("added succesfully!!");
            }
            case 2 -> {
                if(amount<=one.getQuantity()){
                    one.setQuantity(one.getQuantity() - amount);
                    System.out.println("removed succesfully!!");
                }
                else{
                    System.out.println("couldnt remove!!!");
                }   
            }
            default -> {
                System.out.println("Enter a valid input!!");
            }   
        }

    }

    void search(Scanner scanner){
        if(map.isEmpty()){
            System.out.println("There is not products!! ");
            return;
        }
        System.out.print("Enter a product name to search: ");
        String name = scanner.nextLine();
        boolean isRun = false;
        for(Product p: map.values()){
            if(p.getName().equalsIgnoreCase(name)){
               System.out.println("Found: " + p.getName() + " , price: " + p.getPrice());
                isRun = true;
            }
        }
        if(!isRun){
            System.out.println("Invalid name!!");
        }
    }

    void view(Scanner scanner){
        if(map.isEmpty()){
            System.out.println("There is no products!!");
            return;
        }

        System.out.println("Enter a category to search: ");
        String cat = scanner.nextLine();
        boolean check = false;
        for(Product one: map.values()){
            if(one.getCategory().equalsIgnoreCase(cat)){
                System.out.print("name: " + one.getName() + ", Price: " + one.getPrice());
                check = true;
            }
        }

        if(!check){
            System.out.println("couldnt find the category!!!");
        }

    }
    
    void low(Scanner scanner){
        if(map.isEmpty()){
            System.out.println("There is no products!!");
            return;
        }
        boolean low = false;
        for(Product p : map.values()){
            if(p.getQuantity()<10){
                System.out.println("Low stock on: " + p.getName());
                low = true;
            }
        }
        if(!low){
            System.out.println("The stock is fine!!");
        }


    }

    

}
