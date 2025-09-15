package arrays.one_d;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Ar first = new Ar(scanner);
            first.input(scanner);
            first.positive();
            first.negative();
            first.zero();
        }
    }
}

class Ar{
    int[] arr;
    int choice;

    Ar(Scanner scanner) {
        System.out.print("enter the no. of elements in array: ");
        choice = scanner.nextInt();
        arr = new int[choice];
    }
    void input(Scanner scanner){
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter the elements in array: ");
            arr[i] = scanner.nextInt();
        }

    }

    void positive(){
        int pos = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos +=1;
            }
        }
        System.out.println("the postive count is: " + pos);
    }
    
    void negative(){
        int neg = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                neg +=1;
            }
        }
        System.out.println("the negative count is: " + neg);
    }
    void zero(){
        int one = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                one +=1;
            }
        }
        System.out.println("the one count is: " + one);
    }

}
