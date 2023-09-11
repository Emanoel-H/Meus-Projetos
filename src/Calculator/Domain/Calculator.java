package Calculator.Domain;
import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    // This is a simple calculator program that can only take integers so far...
    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    public void showMenu (){
        System.out.println("===========================================");
        System.out.println("         Welcome to the calculator         ");
        System.out.println("Type the kind of operation you want to run:");
        System.out.println("\n 1- to sum (+) \n 2- to divide (%) \n 3- to subtract (-) \n 4- to multiply (X)" +
                "\n 5 - factorial (!) \n 6- Square Root (√) \n 7- square (a^2)" +
                " \n 8- raise to the power of (a^b) \n 9- exit program");
        System.out.println("===========================================");
    }
    public void toCalculate(int op) {
        int a;
        int b;
        try {
            switch (op) {
                case 1:
                    System.out.println("Type the first value: ");
                    a = scanner.nextInt();
                    System.out.println("Type the second value: ");
                    b = scanner.nextInt();
                    int sum = a + b;
                    System.out.println("The result is: " + sum);
                    break;
                case 2:
                    System.out.println("Type the first value: ");
                    a = scanner.nextInt();
                    System.out.println("Type the second value: ");
                    b = scanner.nextInt();
                    int div = a / b;
                    System.out.println("The result is: " + div);
                    break;
                case 3:
                    System.out.println("Type the first value: ");
                    a = scanner.nextInt();
                    System.out.println("Type the second value: ");
                    b = scanner.nextInt();
                    int sub = a - b;
                    System.out.println("The result is: " + sub);
                    break;
                case 4:
                    System.out.println("Type the first value: ");
                    a = scanner.nextInt();
                    System.out.println("Type the second value: ");
                    b = scanner.nextInt();
                    int multi = a * b;
                    System.out.println("The result is: " + multi);
                    break;
                case 5:
                    System.out.println("Type a valid value: ");
                    a = scanner.nextInt();
                    factorial(a);
                    break;
                case 6:
                    System.out.println("Type a valid value: ");
                    a = sc.nextInt();
                    double sqrt = squareRoot(a);
                    System.out.println("The square root of "+ a + " is: " + sqrt);
                    break;
                case 7:
                    System.out.println("Type a valid value: ");
                    a = scanner.nextInt();
                    square(a);
                    break;
                case 8:
                    System.out.println("Type the first value: ");
                    a = scanner.nextInt();
                    System.out.println("Type the second value: ");
                    b = scanner.nextInt();
                    System.out.println("The number " + a + " raised to the " +
                            "power of "+ b + " is: " + Math.pow(a, b));
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("You've inserted an invalid option, try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void square(int baseA) {
        System.out.println("The square of " + baseA + " is: " + baseA * baseA);
    }

    public static double squareRoot(int base) {
        return Math.sqrt(base);
    }

    public static void factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + number + " is: " + fact);
    }
}
