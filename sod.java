import java.util.Scanner;
public class sod{
	public static void main(String[] args){
		int number;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a numebr: ");
		number = scanner.nextInt();
		int np = number;
		while(number>0){
			int result = number%10;
			sum += result;
			number /= 10;
		
		}
		System.out.println("The sum of " + np + " is " + sum);
		scanner.close();
	}

}
