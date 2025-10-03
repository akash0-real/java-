package hashmaps;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class First {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try{
                boolean isRun = true;
                HashMap<String, String> map = new HashMap<>();
                map.put("Akash", "8006109813");
                map.put("Ayush", "8006109814");
                while(isRun){
                    System.out.println("Contact App!!");
                    System.out.println("1. for add");
                    System.out.println("2 for Search by name!");
                    System.out.println("3. for remove a contact!");
                    System.out.println("4. for Display all contacts!!");
                    System.out.println("5. to see if contact exits!!");
                    System.out.println("6. for exit!!");
                    System.out.print("Enter: ");
                    int input = scanner.nextInt();
                    scanner.nextLine();

                    switch(input){
                        case 1 -> {
                            System.out.print("How may contacts do you want to enter: ");
                            int add = scanner.nextInt();
                            scanner.nextLine();
                            for(int i=0;i<add;i++){
                                System.out.print("Enter the name: ");
                                String name =scanner.nextLine();
                                System.out.print("Enter the phone number: ");
                                String phone = scanner.nextLine();
                                
                                map.put(name,phone);
                            }
                        }
                        case 2 -> {
                            System.out.print("Enter a name to search: ");
                            String name = scanner.nextLine();
                            if(map.containsKey(name)){
                                System.out.println("+91 " + map.get(name));
                            }
                            else{
                                System.out.println("Contact does not exist!!");
                            }
                        }
                        case 3 -> {
                            System.out.print("Enter a name to remove: ");
                            String name = scanner.nextLine();
                            map.remove(name);
                        }
                        case 4 -> {
                            for(String key: map.keySet()){
                                System.out.println(key + "+91 " + map.get(key));
                            }
                        }
                        case 5 -> {
                            System.out.print("Enter a name to see if it exits: ");
                            String name = scanner.nextLine();
                            if(map.containsKey(name)){
                                System.out.println("The contact exists!");
                            }
                            else{
                                System.out.println("It does not exists!!");
                            }
                        }
                        case 6 -> {
                            System.out.println("Byeeee......");
                            isRun = false;
                        }
                        default -> {
                            System.out.println("Enter a valid option!!");
                        }

                    }
                }
        
        
        
            }catch(InputMismatchException e){
            System.out.println("error");
        }
    }
        
    }
}
