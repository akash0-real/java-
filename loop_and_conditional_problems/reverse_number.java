import java.util.Scanner;
public class reverse_number {  
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int result=0;
    int number;
    int sum;
    System.out.print("Enter a number: ");
    number = scanner.nextInt();
    while(number!=0){
        sum = number%10;
        result = result*10+sum;
        number = number/10;

    }
    System.out.println("The reversed number is : " + result);
    scanner.close();
    }
    
}
