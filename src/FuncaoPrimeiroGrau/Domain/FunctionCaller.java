package FuncaoPrimeiroGrau.Domain;

import java.lang.Math;

public class FunctionCaller {
    private int a, b, c;

    public void displayMenu(){
        System.out.println("=================================================");
        System.out.println("                 função do 1º grau               ");
        System.out.println("                Δ = b^2 - 4 * a * c              ");
        System.out.println("               x = (-b +- √Δ) / 2 * a            ");
        System.out.println("=================================================");
    }

    public void insertValues(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
        int result1 = getB() * getB() - 4 * getA() * getC();
        System.out.println("O valor de Δ é: " + result1);
        if (result1 < 0){
            System.out.println("Não há raízes reais para esta função");
        } else {
            double result2 = (- getB() + Math.sqrt(result1)) / 2 * getA();
            double result3 = (- getB() - Math.sqrt(result1)) / 2 * getA();

            System.out.println("O valor de x é: " + result2 + " e " + result3);
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
