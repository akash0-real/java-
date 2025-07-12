import java.util.Scanner;
public class fact{
	public static void main(String[] args){
		int number;
		long total = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		number = scanner.nextInt();
		if(number<1){
			System.out.println("the factorial is not defined for negative values!");
		}
		else{
		  for (int i = 2; i <= number; i++){
		  	total = i*total;
		 
		 }

		}
		System.out.println("The FACTORIAl of " + number + " is " + total);

		scanner.close();

	}
}
