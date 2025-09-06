package oops.Constructor;
import java.util.Scanner;
public class cal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int select;
        Calculator one = new Calculator(scanner);
        System.out.println("This is a calculator!");
        System.out.println("Enter a opreation to perform(+,-,*,./)");
        System.out.print("(1. for +, 2. for -, 3 for *, 4 for /): ");
        select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("the sum is : " + one.add());
                break;
            case 2:
                System.out.println("The subtractiion is : " + one.sub());
                break;
            case 3:
                System.out.println("The multiplication is: " + one.mult());
                break;
            case 4:
                System.out.println("The divion is: " + one.divide());
                break;
        }
        scanner.close();
    }
}

class Calculator{
    double num1;
    double num2;

    Calculator(Scanner scanner) {
        System.out.print("enter num1: ");
        num1 = scanner.nextDouble();
        System.out.print("enter second number: ");
        num2 = scanner.nextDouble();
    }
    double add(){
        return num1+num2;
    }
    double sub(){
        return num1-num2;
    }
    double mult(){
         return num1*num2;
    }
    double divide(){
         return num1/num2;
    }
    


}