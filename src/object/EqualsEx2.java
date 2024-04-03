package object;

class Person {
     long id;

    public boolean equals(Object object) {
        if (object instanceof Person) {
            return id == ((Person) object).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011);
        Person p2 = new Person(8011);

        if (p1 == p2) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}
