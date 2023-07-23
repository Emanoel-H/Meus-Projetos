package Calculator.Test;

import Calculator.Domain.Calculator;

import java.util.Scanner;

public class TestCalculator {
    // This is a simple calculator program that can only take integers so far...
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while(input != 9){
            c.showMenu();
            input = sc.nextInt();
            c.toCalculate(input);
        }
        System.out.println();
        sc.close();
    }
}
