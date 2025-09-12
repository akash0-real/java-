package arrays.one_d;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Odd one = new Odd(scanner);
        
        scanner.close();
    }
}

class Arr{
    int[] arr1;
    int choice;
    Arr(Scanner scanner){
        System.out.print("enter the no. elements you want in an array: ");
        this.choice = scanner.nextInt();
        arr1 = new int[choice];
    }
}

class Input extends Arr{
    Input(Scanner scanner){
        super(scanner); 
        for(int i=0;i<choice;i++){
            System.out.print("enter the values in the array: ");
            arr1[i] = scanner.nextInt();
        }
        
    }
    
}

class Even extends Input{
    int sum = 0;
    Even(Scanner scanner) {
        super(scanner);
        for(int i=0;i<choice;i++){
            if(arr1[i]%2 == 0){
                sum +=1;
                
            }
        }
        System.out.println("total number of even numbers are: " + sum);   
    }
    

}
class Odd extends Even{
    int now = 0;
    Odd(Scanner scanner){
        super(scanner);
        for(int i=0;i<choice;i++){
            if(arr1[i]%2 != 0){
                now +=1;
                
            }
        }
        System.out.println("total number of odd numbers are: " + now);
    }
    

}
