package strings;
import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if its palindrome or nah! : ");
        String word = scanner.nextLine();
        String sum = "";
        for (int i=word.length()-1;i>=0;i--){
            sum += word.charAt(i);
        }
        if (word.equals(sum)){
            System.out.println("The word is palindorme!");
        }
        else{
            System.out.println("Its not plaindrome!");
        }

        scanner.close();
    }

}