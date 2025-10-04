package hashmaps;

// all the imports i used in this program..
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

//Main class!!
public class Inventory {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){//Scanner in try to save a little memory!!
        try{        //using try to catch wrong inputs and more!!
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
                    case 8 -> {
                        cart.sort(scanner);
                    }
                    case 9 -> {
                        cart.total();
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
        }catch(InputMismatchException e){   // to catch wrong input format exception!!
            System.out.println("wrong input please enter valid input!!");
        }

        
    }
}
}

//Product class so we can use it in hashmap!!
class Product{
    private final String name;
private final String category; // making them private so no one can access them!!
    private final Double price;
    private int quantity;
    Product(String name,String category,Double price,int quantity){ // constructor to define values!!
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }


    //get methods to help us encapsulation!!
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

    // setter to so we can overwrite quantity!!
    int setQuantity(int quantity){
        return this.quantity = quantity;
    }

}

class Cart{
    private final HashMap<Integer, Product> map = new HashMap<>(); // hashmap inisilation of hashmap!!
    

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
            
            map.put(id,new Product(name, category, price, quantity)); // making them store in hashmap!!
            

            
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

        Product one = map.get(p_id); // to get the id of product!!

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


    //to search via name!!
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


    // to view the products as category wise!!
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


    // for low stock alert!!
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

    //Sorting via options!!!
    void sort(Scanner scanner){
        if(map.isEmpty()){
            System.out.println("there are no products!!");
            return;
        }

        System.out.println("How do you want to sort it?");
        System.out.println("1. to sort via name!!");
        System.out.println("2. to sort via Id!!");
        System.out.println("3. to sort via cateogry!!");
        System.out.println("4. to sort via price!!!");
        System.out.println("5. to sort via quantity!!");
        System.out.println("6. to go back!!");
        System.out.print("Enter: ");
        int check = scanner.nextInt();
        scanner .nextLine();

        ArrayList<Product> products = new ArrayList<>(map.values()); // converting it to arralist!!
        Comparator<Product> comparator; // using comparator!!

        switch (check){
            case 1 -> comparator = Comparator.comparing(Product::getName);
            case 2 -> comparator = Comparator.comparing(Product::getCategory);
            case 3 -> comparator = Comparator.comparing(Product::getPrice);
            case 4 -> comparator = Comparator.comparing(Product::getQuantity);
            case 5 -> {
                System.out.println("Returning to menu...");
                return;
            }
            default -> {
                System.out.println("Invalid input!");
                return;
            }
        }
        // to view and sort the products!!
        Collections.sort(products, comparator);
            for(Product item: products){
                System.out.println("name: " + item.getName() + ", category:  " + item.getCategory() + ", price: " + item.getPrice() + ", quantity: " + item.getQuantity());
                
            }

    }

    // for finding the total price!!
    void total(){
        if(map.isEmpty()){
            System.out.println("There are no products!!");
            return;
        }
        double total = 0;
        for(Product p: map.values()){
            total += p.getPrice() * p.getQuantity();
        }
        System.out.println("The total price is: $" + total);

    }

    

}
