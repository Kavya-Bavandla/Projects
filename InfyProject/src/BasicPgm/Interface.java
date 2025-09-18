package BasicPgm;

interface A1 {
    int a = 10;
    void m1();
    static void m2(){ System.out.println("A1 static m2"); }
    default void m3(){ System.out.println("A1 default m3"); }
}

interface A2 {
    int a = 10;
    void m1();
    static void m2(){ System.out.println("A2 static m2"); }
    default void m3(){ System.out.println("A2 default m3"); }
}

public class Interface implements A1, A2 {
    public static void main(String[] args) {
        
        // Using A2 reference
        A2 in = new Interface();
        in.m1();
        A2.m2();
        in.m3();
        
        // Using A1 reference
        A1 in1 = new Interface();
        in1.m1();
        A1.m2();
        in1.m3();
    }

    @Override
    public void m3() {
        // To avoid conflict, you must override
        System.out.println("Overridden m3() in class");
        
        // If you want to call A1's default method:
        A1.super.m3();

        // If you want to call A2's default method:
        A2.super.m3();
    }

    @Override
    public void m1() {
        System.out.println("Overridden m1()");
    }
}
