package OOP.inheritance;
import java.util.Scanner;
public class Job {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the name of the employee: ");
        String name = scanner.nextLine();
        System.out.print("enter the salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter the name of the employee: ");
        String name2 = scanner.nextLine();
        System.out.print("enter the salary: ");
        int salary2 = scanner.nextInt();
        scanner.nextLine();
        Dev first = new Dev(name,salary);
        first.salary();
        Manager second = new Manager(name2,salary2);
        second.salary();
        scanner.close();
    }
}

class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;

    }
    void salary(){
        System.out.println("the salary of employee are :" + salary);
    }
}

class Manager extends Employee{
    Manager(String name,int salary){
        super(name,salary);
    }
    @Override
    void salary(){
        System.out.println("the salary of mangers are: " + (salary+100));
    }
}
class Dev extends Employee{
    Dev(String name,int salary){
        super(name, salary);
    }

    @Override
    void salary() {
        System.out.println("the pay of developers are: " + (salary+1000));
    }
} 

