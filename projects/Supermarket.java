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
                    System.out.println("4. for Uodate quantity!!");
                    System.out.println("5. for Search by name!!");
                    System.out.println("6. for View by category!!");
                    System.out.println("7. fro Low stock alert!!");
                    System.out.println("8. for Sort the products!!");
                    System.out.println("9. for Total Products value!!");
                    System.out.println("10. for exit!!");
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
                        case 8 -> {
                            arr.sort(scanner);
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
    private final String category;
    private final double price;
    private final int quantity;
    Product(String name,String category,double price,int quantity){
        this.name = name;
        this.id = idCounter++;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
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
    ProductItem(String name,String category,double price,int quantity){
        super(name, category, price, quantity);
    }

    @Override
    public void show(){
        System.out.println("name: " + getName() + " id: " + getId() + ". category: " + getCategory() +" price: " + getPrice() + " quantity: " + getQuantity());
    }
    
}

//creating interface to store array and it will allow us to use runtime polymorphisim to save memory!

interface Arr{
    void input(Scanner scanner);
    void remove(Scanner scanner);
    void display();
    void updateQuantity();
    void search();
    void view();
    void lowStock();
    void sort(Scanner scanner);
    void totalValue();


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
            System.out.println("Enter the category of the product: ");
            String category = scanner.nextLine();
            System.out.print("Enter the Price of the Product ");
            double price = scanner.nextDouble();
            scanner.nextLine();//to read the leftover line.
            System.out.print("Enter the quantity of the product: ");
            int quant = scanner.nextInt();
            scanner.nextLine();

            one.add(new ProductItem(name, category,price, quant));
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
            for(ProductItem two: one){
                two.show();
            }
        }

    }
    @Override
    public void updateQuantity(){

    }

    @Override
    public void search(){
        

    }

    @Override
    public void view(){


    }

    @Override
    public void lowStock(){


    }

    @Override
    public void sort(Scanner scanner){
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
        Comparator<ProductItem> comparator;
        switch (check){
            case 1 -> comparator = Comparator.comparing(ProductItem::getName);
            case 2 -> comparator = Comparator.comparing(ProductItem::getId);
            case 3 -> comparator = Comparator.comparing(ProductItem::getCategory);
            case 4 -> comparator = Comparator.comparing(ProductItem::getPrice);
            case 5 -> comparator = Comparator.comparing(ProductItem::getQuantity);
            case 6 -> {
                System.out.println("Returning to menu...");
                return;
            }
            default -> {
                System.out.println("Invalid input!");
                return;
            }
    }
    
        Collections.sort(one, comparator);
            for(ProductItem item: one){
                item.show();
            }


    }

    @Override
    public void totalValue(){


    }


}