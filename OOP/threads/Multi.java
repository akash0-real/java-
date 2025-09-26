package OOP.threads;

public class Multi {
   public static void main(String[] args) {
    Thread thread = new Thread(new Num("akash"));
    Thread thread1 = new Thread(new Num("Ayush"));
    System.out.println("Game start!");
    thread.start();
    thread1.start();
    try {
        thread.join();
        thread1.join();
    } catch (InterruptedException e) {
        System.out.println("OPPS! something went wrong....");
    }
    System.out.println("Game over!");
    
   } 
}

class Num implements Runnable{
    private final String name;

    Num(String name) {
        this.name = name;
    }
    

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name);
        }
    }
}
