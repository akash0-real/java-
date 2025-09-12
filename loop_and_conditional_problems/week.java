package loop_and_conditional_problems;

import java.util.Scanner;

public class week{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String weekday;
        System.out.print("Enter a day of a week: ");
        weekday = scanner.nextLine();
        weekday = weekday.toLowerCase();

        switch(weekday){
            case "monday" -> System.out.println("Its first day of the week! ");
           
            case "tuesday" -> System.out.println("Its tuesday, 2nd day of the week");
                
            case "wedensday" -> System.out.println("Its 3rd day of the week!");
            
            case "thursday" -> System.out.println("Its 4rd day of the week");

            case "friday"  -> System.out.println("tommorow is weekend!");

            case "saturday" -> System.out.println("its weekend today!");

            case "sunday"  -> System.out.println("tommorow is monday, so enjoy!");  

            default -> System.out.println(weekday + " is not a day!");
        }
            

        scanner.close();

    }

}
