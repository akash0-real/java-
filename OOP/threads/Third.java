package OOP.threads;
public class Third {
   public static void main(String[] args) {
    Thread thread = new Thread(new Val());
    Thread thread1 = new Thread(new Aplha());

    thread.start();
    thread1.start();
    
   } 
    
}

class Val implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}

class Aplha implements Runnable{
    String[] arr = {"a","b","c","d","e"};
    @Override
    public void run(){
        for(String i: arr){
            System.out.println(i);
        }
    }

}
