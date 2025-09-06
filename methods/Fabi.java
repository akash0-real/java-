package methods;
import java.util.Scanner;

public class Fabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        fabinacci(number);
        scanner.close();

    }
    static void  fabinacci(int a){
        int c = 0;
        int b = 1;
        for(int i = 0;i<a;i++){
            System.out.print(c + " ");
            int sum = c+b;
            c=b;
            b= sum;
        }


    }
}

