import java.util.Scanner;
public class area{
	public static void main(String[] args){
		double length;
		double breath;
		int choice;
		double result;
		Boolean isArea = true;
		Scanner scanner = new Scanner(System.in);
		while(isArea){
                	System.out.print("Enter the length of the rectangle: ");
                	length = scanner.nextDouble();
                	System.out.print("enter the width of the rectangle: ");
                	breath = scanner.nextDouble();
			System.out.print("IF u want to find area of a rectangle press 1, or 2 for perimeter(1/2): ");
			choice = scanner.nextInt();

	       if(choice==1){
		       result = length*breath;
		       System.out.println("The area of the reactangle is " + result + " m^2");
	       
	       }
	       else if (choice==2){
	       		result = 2*(length+breath);
			System.out.println("The perimeter of the rectangle is " + result + " m^2");
	       }
	       else{
	       	System.out.println("The input is invalid");


	       }
		
	       
	       System.out.print("Do u want to calculate again(1 for yes/2 for false): ");
	       int again = scanner.nextInt();
	       if (again != 1){
	       		isArea = false;
	       }
	       }
	       scanner.close();
	
	}

}
