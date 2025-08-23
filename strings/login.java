package strings;
import java.util.Scanner;

public class login{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        String pass;
        boolean isRun=true;
        while(isRun){
            System.out.println("Enter username and password!");
            System.out.print("Enter the username:");
            name = scanner.nextLine();
            System.out.print("Enter the Password:");
            pass = scanner.nextLine();
            if(name.equals("admin") && pass.equals("aayush")){
            System.out.println("Welcome!");
            break;   
            }
            else{
            System.out.println("Try Again!");
            }


        }
        scanner.close();
        
}   
}
