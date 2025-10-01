package arrays.arr_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            boolean isRun = true;
            ArrayList<Product>  one = new ArrayList<>();
            while (isRun){
                try{
                    int choice;
                    System.out.println("This is Invertory system for Supermarket!!");
                    System.out.println("Menu!!");
                    System.out.println("1. for add the items!");
                    System.out.println("2. for remove!");
                    System.out.println("3. for display!!");
                    System.out.println("4. for exit!!");
                    System.out.print("Enter: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    
                    switch(choice){
                        case 1 ->{
                            System.out.print("how many elements do you want to enter? : ");
                            int enter = scanner.nextInt();
                            scanner.nextLine();

                            for(int i=0;i<enter;i++){
                                System.out.print("Enter the name of the product: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter the category of the product: ");
                                String category = scanner.nextLine();
                                System.out.print("Enter the price of the product: ");
                                double price = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.print("Enter the quantity of the product: ");
                                int quantity = scanner.nextInt();
                                scanner.nextLine();
                                one.add(new Product(name, category,price, quantity));
                            }
                    }
                    case 2 -> {
                        if(one.isEmpty()){
                            System.out.println("No products to remove!!");
                        }
                        else{
                            System.out.print("Enter the product do you want to remove(enter productId)?: ");
                            int remove = scanner.nextInt();
                            scanner.nextLine();
                            boolean removed = one.removeIf(p-> p.getId()== remove);
                            if(removed){
                                System.out.println("Products removed succesfully!!");
                            }
                            else{
                                System.out.println("Couldnt remove!!");
                            }

                        }
                    }
                    case 3 ->{
                        
                        if(one.isEmpty()){
                            System.out.println("No products available!");
                        }
                        else{
                            Collections.sort(one, Comparator.comparing(Product::getId));
                            for(Product two: one){
                            two.show();
                            System.out.println();
                        }
                    }
                    }
                    case 4 ->{
                        System.out.println("Byeee!!");
                        isRun = false;
                    }
                    default -> System.out.println("Enter the vaild value!!");


                }
            }catch(InputMismatchException e){
                System.out.println("Wrong input!!");
        }
            }
            }

            }
            
            
        }
        
    


class Product{
    private static int idCounter = 10;
    private final String name;
    private final String categoery;
    private final int id;
    private final double price;
    private final int quantity;
    Product(String name,String category,double price,int quantity){
        this.id = idCounter++;
        this.name = name;
        this.categoery = category;
        this.price = price;
        this.quantity = quantity;

    }
    int getId() {
        return id;
    }

    void show(){
        System.out.println("productId: " + id +". name: " + name + ". category: " + categoery + ". price: " + price + ". quantity" + " " + quantity);
    }



}
