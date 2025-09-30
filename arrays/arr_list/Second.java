package arrays.arr_list;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            try{
                System.out.print("how many student do you want ot enter: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                ArrayList<Student> one = new ArrayList<>();
                for(int i=0;i<choice;i++){
                    System.out.print("name: ");
                    String name = scanner.nextLine();
                    System.out.print("roll_no: ");
                    int roll_no = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    
                    one.add(new Student(name,roll_no,year));
            }
            System.out.println("Do you want to see the students/ add another/ remove?");
            System.out.print("1 for add/ 2 for remove/3 for view: ");
            int chance = scanner.nextInt();
            scanner.nextLine();

            switch (chance){
                case 1 -> {
                    System.out.println("how many student do you want ot enter: ");
                    int again = scanner.nextInt();
                    scanner.nextLine();
                    for(int i=0;i<again;i++){
                        System.out.print("name: ");
                        String name = scanner.nextLine();
                        System.out.print("roll_no: ");
                        int roll_no = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                    
                        one.add(new Student(name,roll_no,year));
                }
            }
                case 2 -> {
                    System.out.println("which student do u want to remove: ");
                    int rem = scanner.nextInt();
                    scanner.nextLine();
                    one.remove(rem-1);
                }
                case 3 -> {
                    for(Student two: one){
                        System.out.println(two.display());
                    }
                }
                default -> System.out.println("enter valid input!!");
            }
        
        }catch(InputMismatchException e){
            System.out.println();
        }
            

        }
        
        
    }
}

class Student{
    private final String name;
    private final int roll_no;
    private final int year;
    Student(String name,int roll_no,int year){
        this.name = name;
        this.roll_no = roll_no;
        this.year = year;
    }
    String display(){
        return "name: " + name + ". roll_no: " + roll_no + ". year: " + year;
    }


}
