package polymorphism;

public class BlingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
    }

}
class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x= 200;

    void method() {
        System.out.println("ChildMethod");
    }
}
