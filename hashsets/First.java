package hashsets;
import java.util.HashSet;
public class First {
    public static void main(String[] args) {
        

    HashSet<String> set = new HashSet<>();

    set.add("Apple");
    set.add("Banana");
    set.add("Apple");  
    System.out.println(set);  
    
    System.out.println(set.contains("Apple"));  

    
    set.remove("Apple");

  
    System.out.println(set.size());

    System.out.println(set.isEmpty());

   
    for(String item : set) {
        System.out.println(item);
    }

    set.clear();
        }

}
