package strings;
import java.util.Scanner;

public class count_vowel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word;
        int count = 0;
        System.out.print("enter a string: ");
        word = scanner.nextLine();
                for (int i=0;i<word.length();i++){
                    char c = word.charAt(i);
                    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                        count ++;
                    }

        }
        System.out.println("The vowels are: " + count);
        scanner.close();
    }
    
}
