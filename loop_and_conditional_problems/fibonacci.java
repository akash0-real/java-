import java.util.Scanner;
public class fibonacci{
	public static void main(String[] args){
		int number;
		Scanner scanner = new Scanner(System.in);
	        boolean isRun = true;
		while(isRun){
			int a=0, b=1;
			System.out.print("how many terms do you want? : ");
			number = scanner.nextInt();
			System.out.print("the fibonnaci series of " + number + " is : ");
			for(int i=0; i<number; i++){
				System.out.print(a + " ");
				int sum = a+b;
				a=b;
				b=sum;
			
			}
			System.out.println();	
			System.out.print("Do you wanna try again?(1 for yes/ 2 for no): ");
			int again = scanner.nextInt();
			if(again!=1){
				isRun = false;
			}	
		
		}
		scanner.close();
	
	}

}
