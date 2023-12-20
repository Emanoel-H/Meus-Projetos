package BankSystem.Test;

import BankSystem.Domain.Cliente;
import BankSystem.Domain.Conta;
import BankSystem.Domain.ContaCorrente;
import BankSystem.Domain.ContaPoupanca;
import BankSystem.Security.Autenticacao;
import BankSystem.Security.LoginInvalidException;

import java.util.Scanner;

public class BankSystemTest01 {

    public static void main(String[] args) throws LoginInvalidException {
        Cliente cliente = new Cliente("Catarina Catarrenta", "12345678", "cat", "raissa");
        ContaCorrente cc = new ContaCorrente(123, 531, 100, cliente);
        Conta cp = new ContaPoupanca(321, 452, 0, new Cliente("Raissa?", "32178956"));

        cc.depositar(100);
        cc.transferir(cc, cp, 50);

        System.out.println(cc);
        System.out.println(cp);

        Autenticacao autenticacao = new Autenticacao();
        autenticacao.login(cliente.getUsername(), cliente.getPassword());
    }





}
