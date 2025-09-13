package oops.inheritance;

public class First {
    public static void main(String[] args) {
        C one = new C();
        one.a();
        one.b();
        one.c();
    }
    
}

class A{
    String name = "hello froma A";
    void a(){
        System.out.println(name);
    }
}
class B extends A{
    String two = "hello from B";
    void b(){
        System.out.println(two);
    }
}
class C extends B{
    String three = "hello from C";
    void c(){
        System.out.println(three);
    }
}
