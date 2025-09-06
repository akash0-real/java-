package methods;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("enter a number: ");
        num = scanner.nextInt();
        
        one(num);
        
        scanner.close();

    }
    static void one(int a){
        if(a==1){
            System.out.println("it is not prime!");
        }
        if(a==2){
            System.out.println("it is prime!");
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("it is not prime number!");
                break;
            }
            else{
                System.out.println("it is prime!");
            }
        }
    }
}
