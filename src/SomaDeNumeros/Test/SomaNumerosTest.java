package SomaDeNumeros.Test;


import SomaDeNumeros.Domain.SomaNumeros;

public class SomaNumerosTest {
    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();

        //Adicionando números à lista
        sn.adicionarNumero(25);
        sn.adicionarNumero(235);
        sn.adicionarNumero(65);
        sn.adicionarNumero(785);

        //retornando valores
        sn.exibirNumeros();
        System.out.println("A soma total dos valores é: ");
        System.out.println(sn.calcularSoma());
        System.out.println(sn.encontrarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());
    }
}
