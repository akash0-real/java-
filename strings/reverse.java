package strings;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        String reversed = "";
        System.out.print("Enter a string to reverse: ");
        name = scanner.nextLine();
        for(int i= name.length() - 1;i>=0;i--){
            reversed +=name.charAt(i);
        }
        System.out.println(reversed);
        scanner.close();

    }
    


    
}
