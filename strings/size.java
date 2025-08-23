package strings;
import java.util.Scanner;
public class size {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.println("Enter a sentence to find the length of it: ");
        sentence = scanner.nextLine();
        double length = sentence.length();
        System.out.println("The length of the sentence is " + length);
        scanner.close();

    }
}
