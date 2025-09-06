package methods;
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
       
        System.out.print("enter the first number: ");
        a = scanner.nextInt();
        System.out.println("The factorial of " + a + " is " + OP(a));
        scanner.close();
        
    }
    static int OP(int a){
        int result = 1;
        for (int i=1;i<=a;i++){
            result *= i;
        }
        return result;

    } 
    
    
}
