package methods;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String first;
        System.out.print("enter a string: ");
        first = scanner.nextLine();
        check(first);
        scanner.close();

    }
    static void check(String a){
        String one = "";
        for (int i = a.length()-1;i>=0;i--){
            one += a.charAt(i);
        }
        if(a.equals(one)){
            System.out.println("This is a plaindrome!");
        }
        else{
            System.out.println("it is not plaindrome!");
        }


    }
}
