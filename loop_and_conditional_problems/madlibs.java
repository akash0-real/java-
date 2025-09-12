package loop_and_conditional_problems;
import java.util.Scanner;

public class madlibs{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String time;
		String action;
		String name;
		String action2;
		System.out.println("This is a fill in the blanks game.");
		boolean isRun = true;	
		while(isRun){
			System.out.print("Enter the time(in am/pm): ");	
			time = scanner.nextLine();	
			System.out.print("Enter the action in past tense: ");
			action = scanner.nextLine();
			System.out.print("Enter the name: ");
			name = scanner.nextLine();
			System.out.print("Enter the action in past tense again: ");
			action2 = scanner.nextLine();
			System.out.println("Today i woke up at " + time + " .");
			System.out.println("then i " + action + " and meet " + name + ".");
			System.out.println("me and " + name + action2 + "!");
			
			System.out.print("Do you want to play again(1 for yes/2 for no): ");
			int choice = scanner.nextInt();
			if (choice!=1){
				System.out.println("goodbye");
				isRun = false;	
			}




		}	
		scanner.close();

		
		}	
	
}





