package projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Supermarket {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try{//to dectect any error!!
                boolean isRun = true;
                Arr arr = new two();
                //using while loop to make it loop infinite times!
                while(isRun){
                    System.out.println("Welcome to Supermarket Inventory!!! ");
                    System.out.println();
                    System.out.println("Menu.....");
                    System.out.println("1. for add!");
                    System.out.println("2. for remove!");
                    System.out.println("3. for display!!");
                    System.out.println("4. for exit!!");
                    System.out.print("Enter: ");
                    int run = scanner.nextInt();
                    scanner.nextLine();
                    switch(run){  //Switch to go through all cases
                        case 1 ->{
                            arr.input(scanner);
                        }
                        case 2 -> {
                            arr.remove(scanner);
                        }
                        case 3 -> {
                            arr.display();
                        }
                        case 4 -> {
                            System.out.println("byeee... ");
                            System.out.println("Exiting in 4....");
                            try {
                                Thread.sleep(4000);
                            } catch (InterruptedException e) {
                                System.out.println("Error!!");
                            }
                            isRun = false; // to break out of the loop!!
                        }
                        default -> System.out.println("Enter a valid input!!");
                    }
                }
            
            }catch(InputMismatchException e){
                System.out.println("Wrong Input!!!");
            }

        }
        
    }
}

//abstract class to define our variable and stores values!

abstract class Product{
    private static int idCounter = 100;
    private final String name;
    private final int id;
    private final double price;
    private final int quantity;
    Product(String name,double price,int quantity){
        this.name = name;
        this.id = idCounter++;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    abstract void show();

}

// inheirting abstract class to display and assign the values!

class ProductItem extends Product{
    ProductItem(String name,double price,int quantity){
        super(name, price, quantity);
    }

    @Override
    public void show(){
        System.out.println("name: " + getName() + " id: " + getId() + " price: " + getPrice() + " quantity: " + getQuantity());
    }
    
}

//creating interface to store array and it will allow us to use runtime polymorphisim to save memory!

interface Arr{
    void input(Scanner scanner);
    void remove(Scanner scanner);
    void display();

}

class two implements Arr{
    ArrayList<ProductItem> one = new ArrayList<>(); // making an array of Products!!
    //TO get user input and assign values to an array!!
    @Override
    public void input(Scanner scanner){
        System.out.print("Enter how many elements do you want to add: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<choice;i++){
            System.out.print("Enter the name of the Product: ");
            String name = scanner.nextLine();
            System.out.print("Enter the Price of the Product ");
            double price = scanner.nextDouble();
            scanner.nextLine();//to read the leftover line.
            System.out.print("Enter the quantity of the product: ");
            int quant = scanner.nextInt();
            scanner.nextLine();

            one.add(new ProductItem(name, price, quant));
        }
    }
    @Override
    public void remove(Scanner scanner){
        System.out.print("Enter which element do you want to remove(use product_id): ");
        int rem = scanner.nextInt();
        scanner.nextLine();
        if(one.isEmpty()){
            System.out.println("No products to remove!!"); //checking to see wheater array is empty or not!
        }
        else{
            boolean delete = one.removeIf(a->a.getId()==rem); // removing the product user wants via id
            if(delete){
                System.out.println("Removed succesfully!!");
            }
            else{
                System.out.println("Couldnt remove!!");
            }
        }


    }

    @Override
    public void display(){
        if(one.isEmpty()){
            System.out.println("The array is empty!!");
        }
        else{
            Collections.sort(one, Comparator.comparing(ProductItem::getId)); // Sorting an array using sort!
            for(ProductItem two: one){
                two.show();
            }
        }

    }
}