package FuncaoSegundoGrau.Test;

import FuncaoSegundoGrau.Domain.FunctionCaller;

import java.util.Scanner;

public class FunctionTest {
    public static void main(String[] args){
        FunctionCaller fc = new FunctionCaller();
        Scanner sc = new Scanner(System.in);

        fc.displayMenu();
        System.out.println("Insira o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Insira o valor de b: ");
        int b = sc.nextInt();
        System.out.println("Insira o valor de c: ");
        int c = sc.nextInt();

        fc.insertValues(a, b, c);
    }
}
