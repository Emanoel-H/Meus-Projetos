package BankSystem.Test;

import BankSystem.Domain.Cliente;
import BankSystem.Domain.Conta;
import BankSystem.Domain.ContaCorrente;
import BankSystem.Domain.ContaPoupanca;

public class Test01 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Catarina Catarrenta", "12345678");
        ContaCorrente cc = new ContaCorrente(123, 531, 100, cliente);
        Conta cp = new ContaPoupanca(321, 452, 0, new Cliente("Raissa?", "32178956"));

        cc.depositar(100);
        cc.transferir(cc, cp, 50);

        System.out.println(cc);
        System.out.println(cp);

    }



}
