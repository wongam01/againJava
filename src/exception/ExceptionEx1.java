package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(1);
            System.out.println(2);
            System.out.println(0 / 0); // ArithmeticException 발생
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
