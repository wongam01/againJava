package polymorphism;
public class BlindingTest3 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();
        System.out.println();
        System.out.println(c.x);
        c.method();
        System.out.println(p.x);
        p.method();
    }
}

class Parent1 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1{
    int x = 200;
    void method() {
        System.out.println("x=" + x);
        System.out.println(super.x);
        System.out.println(this.x);
    }
}