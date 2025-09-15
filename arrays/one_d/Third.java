package arrays.one_d;
import java.util.Scanner;
public class Third{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        Sum one = new Sum(scanner);
        one.show();
        scanner.close();
        }
    }
}

class Arr{
    int choice;
    int[] arr1;
    Arr(Scanner scanner){
        System.out.print("how many elements do u want in an array: ");
        this.choice = scanner.nextInt();
        this.arr1 = new int[choice];
    }
}

class Input extends Arr{
    Input(Scanner scanner){
        super(scanner);
        for(int i=0;i<choice;i++){
            System.out.print("enter the elements: ");
            this.arr1[i] = scanner.nextInt();
        }
    }
}
class Sum extends Input{
    int all = 0;
    Sum(Scanner scanner){
        super(scanner);
    }
    void show(){
            for(int i=0;i<arr1.length;i++){
            all += arr1[i];
        }
        System.out.println("the sum is: " + all);
        }
}
