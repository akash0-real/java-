import java.util.Scanner;
public class gcd{
	public static void main(String[] args){
		int num1;
		int num2;
		int org1;
		int org2;
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun){
			System.out.print("Enter the number 1: ");
			num1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			num2 = scanner.nextInt();
			org1 = num1;
			org2 = num2;
			if (num1 ==0){
				System.out.println("The gcd of " + org1 + " and " + org2 + "  is: " + num2);
			}
			if (num2 ==0){
                                System.out.println("The gcd of " + org1 + " and " + org2 + "  is: " + num1);
                        }

			if (num1<num2){
				int temp = num1;
				num1 = num2;
				num2 = temp;
			
			}
			while(num2!=0){
				int reminder = num1%num2;
				num1 = num2;
				num2 = reminder;
			
			}
			System.out.println("GCD of " + org1 + " and " +  org2 + " is: " + num1);
			System.out.print("Do you wanna find again(1 for yes/ 2 for no): ");
			int again = scanner.nextInt();
			if (again!=1){
				isRun = false;
			}	
				
		}

		scanner.close();

	}


}
