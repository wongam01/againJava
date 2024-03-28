package interfaces;

public interface Food {
    void cook(); // 추상 메서드
}

class Pizza implements Food {
    @Override
    public void cook() {
        System.out.println("Cooking a Pizza");
    }
}

class Sushi implements Food {
    @Override
    public void cook() {
        System.out.println("Preparing Sushi");
    }
}

class Main {
    // 1. 전달한 new Pizza 라는 인스턴스는 food 라는 parameter 에 전달이 된다.
    // 2. food.cook 라는 메서드를 호출하여 Pizza 클래스의 cook() 실행
    public static void main(String[] args) {
        cookFood(new Pizza());
        cookFood(new Sushi());
    }

    public static void cookFood(Food food) { // Food 인터페이스를 매개변수로 받는 메서드
        food.cook();
    }
}

