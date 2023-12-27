package BankSystem.Test;

import BankSystem.Domain.ContaPoupanca;
import BankSystem.Domain.SignUpSystem;

public class BankSystemTest02 {
    public static void main(String[] args) {
        SignUpSystem signUpSystem = new SignUpSystem();

        signUpSystem.adicionarCliente("Emanoel", "54321698", "Acerola", "1a8");
        System.out.println(signUpSystem.getClienteByUsername("Acerola"));

        signUpSystem.adicionarCliente("Iury", "321987564", "Bimbao", "8a1");
        System.out.println(signUpSystem.getClienteByUsername("Bimbao"));

        signUpSystem.adicionarContaCorrente(312, 500, 100d, signUpSystem, "Acerola");
        System.out.println(signUpSystem.getContaByUsername("Acerola"));

        signUpSystem.removerClientePorUsername("Bimbao");
        System.out.println(signUpSystem.getClienteByUsername("Bimbao"));


        /*
        signUpSystem.atualizarCliente("Acerola", signUpSystem.getClienteByUsername("Acerola"),
                new Cliente("Catarina Catarrenta", "12345678", "cat", "raissa"));
        System.out.println(signUpSystem.getClienteByUsername("cat"));*/

        signUpSystem.atualizarConta("Acerola",
                new ContaPoupanca(123, 531, 100, signUpSystem.getClienteByUsername("Acerola")));
        System.out.println(signUpSystem.getContaByUsername("Acerola"));

        signUpSystem.removerContaPorUsername("Acerola");
        System.out.println(signUpSystem.getContaByUsername("Acerola"));
    }
}
