package Calculator.Test;

public class TestingFactorial {
    public static void main(String[] args) {
        int a = 7;
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + a + " is: " + fact);
        System.out.println(Math.sqrt(49));
    }
}
