package arrays.two_d;

public class First {
    public static void main(String[] args) {
        String[][] shop = {{"apple","mango","orange"},{"pizza", "chicken","pasta"},{"potato","tomamto","onion"}};
        for(String[] item:shop){
            for(String food: item){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
