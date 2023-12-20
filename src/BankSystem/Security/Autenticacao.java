package BankSystem.Security;

import BankSystem.Domain.Cliente;

import java.util.Scanner;

public class Autenticacao {
    public void login(String username, String password) throws LoginInvalidException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Usuário: ");
        String typedUsername = sc.nextLine();
        System.out.println("Senha: ");
        String typedPassword = sc.nextLine();

        if (!username.equals(typedUsername) || !password.equals(typedPassword)){
            throw new LoginInvalidException();
        } else {
            System.out.println("Login Efetuado");
        }
    }
}
