package OOP.constructor;
import java.util.Scanner;
public class Library {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many books do you want to enter?: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Book[] one = new Book[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("Enter the book name: ");
            String title = scanner.nextLine();
            System.out.print("enter the author name: ");
            String author = scanner.nextLine();
            System.out.print("enter the available copies: ");
            int available_copies = scanner.nextInt();
            scanner.nextLine();
            one[i] = new Book(title,author,available_copies);

        }
        System.out.print("Do you want to borrow, return or exit? (1=borrow, 2=return, 3=exit): ");
        int think = scanner.nextInt();
        scanner.nextLine();
        if(think == 1){
            System.out.print("enter the book do u want to borrow: ");
            String Borrow = scanner.nextLine();
            for(Book b: one){
                if(b.title.equals(Borrow)){
                    b.borrow();
                }
            }
        } else if (think==2) {
            System.out.print("enter the name of the book you want to return: ");
            String rest = scanner.nextLine();
            for(Book b: one){
                if(b.title.equals(rest)){
                    b.return_book();
                }

            }
        } else if (think==3) {
            System.out.println("byee!!");

        }
        else{
            System.out.println("enter valid input!!");
        }
        scanner.close();

    }
}
class Book{
    String title;
    String author;
    int available_copies;
    Book(String title,String author,int available_copies){
        this.title = title;
        this.author = author;
        this.available_copies = available_copies;
    }
    void borrow(){
            System.out.println("You can borrow it!!");
            available_copies --;
            System.out.println("available copies are: " +available_copies);
    }
    void return_book(){
        available_copies ++;
        System.out.println("book has been returned!!");
        System.out.println("available copies are: " + available_copies);
    }
}

