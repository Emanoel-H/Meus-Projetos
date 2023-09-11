package SomaDeNumeros.Domain;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        // This is my signature, my knowledge:
        System.out.println("Em sua tradução moderna, a palavra grega sôma significa 'corpo'");
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;

        if (!numeros.isEmpty()){
            for (int numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            System.out.println("O maior número é: ");
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (int numero : numeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            System.out.println("O menor número é: ");
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}
