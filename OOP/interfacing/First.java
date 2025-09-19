package OOP.interfacing;

public class First {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
        
    }
}

interface Prey{
    void flee();
}

interface Predator{
    void hunt();
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("rabbit is running");
    }

}

class Fish implements Prey,Predator{
    @Override
    public void flee(){
        System.out.println("some fish Swim away!!");
    }

    @Override
    public void hunt(){
        System.out.println("while ohters hunt the other fishes!!");
    }
}

class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("the Hawk is hunting");
    }
}