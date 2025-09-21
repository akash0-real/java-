package OOP.polymorphisim;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Characters characters;
        int choice;

        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("enter the character you want to select(1 for Acher/2 for Warrior/3 for wizard): ");
            choice = scanner.nextInt();
        }

        switch(choice){
            case 1 -> {
                characters = new Acher();
                characters.attack();
            }
            case 2 -> {
                characters = new Warrior();
                characters.attack();
            }
            case 3 -> {
                characters = new Wizard();
                characters.attack();
            }
            default -> System.out.println("enter a valid value!!");
        }
        
    }
    
}

interface Characters{

    void attack();
}

class Acher implements Characters{

    @Override
    public void attack(){
        System.out.println("Acher uses arrows to attack!!");
    }
}

class Warrior implements Characters{

    @Override
    public void attack(){
        System.out.println("Warrior uses weapons to attack!!");
    }
}

class Wizard implements Characters{

    @Override
    public void attack(){
        System.out.println("Wizrad uses magic to attack!!");
    }

}
