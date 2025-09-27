package OOP.enums;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try{
                System.out.print("enter a day of the week: ");
            String week = scanner.nextLine();
            Day day = Day.valueOf(week);
            switch(day){
            case monday, tuesday, wednesday, thursday, friday -> System.out.println("it is a weekday!!");
            case saturday,sunday -> System.out.println("it is a weekend!!");
        }
        }
        catch(IllegalArgumentException e){
            System.out.println("wrong argument.. pls enter a string!!");
            
        }

        }
        
    }    
}

enum Day{

    sunday(1),monday(2),tuesday(3),wednesday(4),thursday(5),friday(6),saturday(7);

    private final int dayNumber;
    Day(int dayNumber) {
        this.dayNumber = dayNumber;

    }
    public int getDayNumber(){
        return this.dayNumber;
    }

}


