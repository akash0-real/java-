import java.util.Scanner;
public class Linear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Search one = new Search(scanner);
        scanner.close();
    }
}

class Arr{
    int[] arr1;
    int choice;
    Arr(Scanner scanner){
        System.out.print("enter the no of elements you want in an array: ");
        this.choice = scanner.nextInt();
        this.arr1 = new int[choice];
    }
}

class Input extends Arr{
    Input(Scanner scanner){
        super(scanner);
        for(int i=0;i<arr1.length;i++){
            System.out.print("enter the elements in array: ");
            arr1[i] = scanner.nextInt();
        }
    }
}

class Search extends Input{
    int number;
    Search(Scanner scanner){
        super(scanner);
        System.out.print("enter the number you want to enter: ");
        this.number = scanner.nextInt();
        boolean isRun = false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == number){
                System.out.println("the index of the element is: " + i);
                isRun = true;
                break;
            }
        }
        if(!isRun){
            System.out.println("element not found!");
        }
        
    }
}
