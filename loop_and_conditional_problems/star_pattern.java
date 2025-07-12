import java.util.Scanner;
public class star_pattern{
	public static void main (String[] args){
		int choice;
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while(isRun){
			System.out.print("enter the number of stars: ");
			choice = scanner.nextInt();
			for(int i=1; i<=choice; i++){
				for (int j=1; j<=i; j++){
					System.out.print("*");
				}
				System.out.println();

			}
			System.out.print("Do you want to play again(1 for yes/2 for no): ");
			int again = scanner.nextInt();
			if(again!=1){
				isRun = false;

			}



		}
	
		scanner.close();

	}
	
}
