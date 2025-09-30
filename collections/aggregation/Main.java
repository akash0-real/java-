package collections.aggregation;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Please enter how many books you want to insert: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Books[] books = new Books[choice];
        for(int i=0;i<choice;i++){
            System.out.print("Enter the name of the book: ");
            String name = scanner.nextLine();
            System.out.print("Enter the publishing year of the book: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the total number of pages in the book: ");
            int pages = scanner.nextInt();
            scanner.nextLine();
            books[i] = new Books(name, year, pages);
        }
        System.out.println("Enter the library name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the year it got buildt: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        Library lib = new Library(name, year, books);
        lib.show();

    }
    
   } 
}

class Books{
    String name;
    int year;
    int pages;

    Books(String name,int year, int pages){
        this.name = name;
        this.year = year;
        this.pages = pages;
    }
    String display(){
        return  name + year + pages + " pages";
    }

}

class Library{
    String name;
    int year;
    Books[] books;

    Library(String name,int year,Books[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void show(){
        System.out.println("the name of the library is: " + name + ".The year it was buildt: " + year);
        System.out.println("total books avialbe: ");
        for(Books book: books){
            System.out.println(book.display());
        }
    }
}
