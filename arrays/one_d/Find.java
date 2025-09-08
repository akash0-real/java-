package arrays.one_d;
import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Enter the size of an array: ");
        choice = scanner.nextInt();
        int[] arr = new int[choice];
        
        for(int i = 0;i<arr.length;i++){
            System.out.print("enter the values in string: ");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int max_index = 0;
        int min = arr[0];
        int min_index = 0;

        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
        }
        for (int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println("the biggest is " + max);
        System.out.println("the index of max is: " + max_index);
        System.out.println("the smallest is " + min);
        System.out.println("the index of min is: " + min_index);

        scanner.close();
    }
    
}
