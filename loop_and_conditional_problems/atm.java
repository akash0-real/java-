import java.util.Scanner;
public class atm{
	public static void main(String[] args){
		double balance;
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your balance: ");
		balance = scanner.nextDouble();
		while(true){
			System.out.println("ATM menu" + "\n" + "1. check balance" + "\n" + "2. deposit money" + "\n" + "3. withdraw money" + "\n" + "4. exit");
			choice = scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("Your balance is: " + balance + " $");
					break;
				case 2:
					System.out.println("Enter the amount you want to deposit: ");
					double dep = scanner.nextDouble();
					balance = balance+dep;
					break;
				case 3:
					System.out.print("Enter the amount you want to withdraw: ");
					double with = scanner.nextDouble();
					if(with>balance){
						System.out.println("insuffuiceint amount");
					}
					else{
				           balance = balance-with;
					}
					break;

				case 4:
					System.out.println("goodbye!");
					scanner.close();
					return;

			       default :
					System.out.println("Enter again");
			
			}	
		
		
		}

	
	}


}

