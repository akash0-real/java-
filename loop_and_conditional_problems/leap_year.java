import java.util.Scanner;
public class leap_year{
	public static void main(String[] args){
		int year;
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while(isRun){
			System.out.print("Enter the year: ");
			year = scanner.nextInt();
			if (year%4==0){
				System.out.println("The year " + year + " is leap year!");
			
			}
	
			else{
		           System.out.println("The year " + year + " is not leap year!");
			
			}	
		System.out.print("DO u wanna try again?(1 for yes/ 2 for no): ");
		int again = scanner.nextInt();
		if(again!=1){
			isRun = false;
		}
		}
	
		scanner.close();	
	}



}
