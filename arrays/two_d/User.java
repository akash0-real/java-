package arrays.two_d;
import java.util.Arrays;
import java.util.Scanner;
public class User {
   public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int[][] arr;
            arr = new int[3][2];
            for(int[] row : arr){
                for(int j = 0; j < row.length; j++){
                    row[j] = scanner.nextInt();
                }
            }
            for(int[] a: arr){
                System.out.print(Arrays.toString(a));
            }
            
            
        }
   } 
}
