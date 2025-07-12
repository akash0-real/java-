import java.lang.Math;
import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		Boolean isPe = true;

		if(number<=1){
			System.out.println("The number " + number + " is NOT a PRIME number!");
		}
		else if(number==2){
		        isPe = true;	
		}
		for(int i = 2; i<=Math.sqrt(number); i++){
			if(number%i==0){
				isPe = false;
				break;
			}
			
		}
		if (isPe){
			System.out.print("The number is prime!");
		}
		else{
		  System.out.println("the number is not prime");
		}

		scanner.close();
	}
	
}
