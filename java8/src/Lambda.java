/**
 * Created by user on 17/09/16.
 */
public class Lambda {
    public static void main(String[] args) {
        Lambda lam = new Lambda();

        MathOperation addition = (a, b) -> a + b;

        MathOperation subtraction = (a, b) -> a-b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> a/b;

        System.out.println(" 10 + 5 = " + lam.operate(10, 5, addition));
        System.out.println(" 10 - 5 = " + lam.operate(10, 5, subtraction));
        System.out.println(" 10 * 5 = " + lam.operate(10, 5, multiplication));
        System.out.println(" 10 / 5 = " + lam.operate(10, 5, division));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = message -> System.out.println("Hello " + message);

        greetingService1.sayMessage(" Ram");
        greetingService2.sayMessage(" Shyam");

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}
