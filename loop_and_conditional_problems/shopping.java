import java.util.Random;
import java.util.Scanner;
public class shopping {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        int choice;
        boolean isRun = true;
        System.out.print("This is a guessing game!");
        while(isRun){
            int number = random.nextInt(0,11);
            System.out.print("Guess a number betwen 1 to 10. : ");
            choice = scanner.nextInt();
            System.out.println("Your choice is " + choice);
            System.out.println("Computer choice is " + number);
            if(choice == number){
                System.out.println("YOU WON!");
            }
            else{
                System.out.println("NICE TRY!");
            }
            System.out.print("Do u wanna play again(1 for yea/2 for no): ");
            int turn = scanner.nextInt();
            if(turn!=1){
                isRun = false;
            }
        }

        scanner.close();

    }    
}
