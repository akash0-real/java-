import java.util.Scanner;
public class perfect{
    public static void main(String[] args) {
        int number;
	Scanner scanner = new Scanner(System.in);
	boolean isRun = true;
	while(isRun){
		System.out.print("enter a number: ");
      		number = scanner.nextInt();
		int sum = 0;
       		for (int i = 1; i <= number / 2; i++) {
           		 if (number % i == 0) {
               			 sum += i; 
            			}
        		}

        		if (sum == number) {
            			System.out.println(number + " is a perfect number!");
       		        } else {
           		     System.out.println(number + " is NOT a perfect number.");
        		}
		System.out.print("Do wanna try again(1 for yes/ 2 for no): ");
		int choice = scanner.nextInt();
		if (choice!=1){
			isRun = false;
		}
	}
	scanner.close();
    }
}
