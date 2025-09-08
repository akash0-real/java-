package arrays.one_d;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num ;
        int choice;
        System.out.print("Enter how many elements you want in an array: ");
        choice = scanner.nextInt();
        num = new int[choice];
        for (int i=0;i<=num.length-1;i++) {
            System.out.print("Enter the numbers in array: ");
            num[i] = scanner.nextInt();            
        }
        int sum = num[0];
        int index = 0;
        for (int i=0;i<num.length;i++){
            if(num[i]>sum){
                sum = num[i];
                index = i;
            }
        }
        System.out.println("The largest number is :" + sum);
        System.out.println("the index of the number is: " + index);


        scanner.close();
    }
}
