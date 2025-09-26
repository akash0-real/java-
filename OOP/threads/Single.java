package OOP.threads;

public class Single {
   public static void main(String[] args) {
    One one = new One();
    Thread thread = new Thread(one);
    thread.run();
    

   }
    
}

class One implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
