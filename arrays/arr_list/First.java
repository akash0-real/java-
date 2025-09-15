package arrays.arr_list;
import java.util.ArrayList;
import java.util.Scanner;
public class First {
   public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
        ArrayList<Integer> one = new ArrayList<>(10);
        for(int i = 0;i<5;i++){
            one.add(scanner.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.print(one.get(i) + " ");
        }
        System.out.println(one);

    }
   } 
}
