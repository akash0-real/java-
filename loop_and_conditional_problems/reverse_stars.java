import java.util.Scanner;
public class reverse_stars{
	public static void main(String[] args){
		int choice;
		boolean isRun = true;
		Scanner scanner = new Scanner(System.in);
		while(isRun){
		System.out.print("Enter the number: ");
		choice = scanner.nextInt();
		for (int i=choice; i>=1; i--){
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
		
			System.out.println();
			
		}
		System.out.print("Do you want to play again(1 for yes/ 2 for no): ");
		int again = scanner.nextInt();
		if(again!=1){
			isRun = false;
			System.out.println("goodbye!");
		}

		}

		scanner.close();
	
	
	}


}
