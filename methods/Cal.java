package methods;
import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("enter first number: ");
        a = scanner.nextInt();
        System.out.print("enter second number: ");
        b = scanner.nextInt();

        System.out.println("1 for Add.");
        System.out.println("2 for Subtraction.");
        System.out.println("3 for Multiplication.");
        System.out.println("4 for Division.");
        System.out.println("5 for Modulus.");
        System.out.print("enter what opreation you want to do: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("the sum is " + Add(a, b));
            
            case 2 -> System.out.println("The subtraction is " + Sub(a, b));

            case 3 -> System.out.println("The multiplication is " + Mul(a, b));
            
            case 4 -> {if (b != 0) {
                    System.out.println("Result: " + Div(a, b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
            }

            case 5 -> {if (b != 0) {
                    System.out.println("Result: " + Mod(a, b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
            }
            
            default -> System.out.println("enter valid opreation!");
                
        }


        scanner.close();

    }

    static int Add(int a,int b){
        return a+b;
    }
    static int Sub(int a,int b){
        return a-b;
    }
    static int Mul(int a,int b){
        return a*b;
    }
    static int Div(int a,int b){
        return a/b;
    }
    static int Mod(int a,int b){
        return a%b;
    }

}
