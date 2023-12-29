package BankSystem.Domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SignUpSystem {

    private static Map<String, Cliente> clientesMap;
    private Map<String, Conta> contasMap;

    public SignUpSystem(){
        this.clientesMap = new HashMap<>();
        this.contasMap = new HashMap<>();
    }

    public void adicionarCliente(String nome, String cpf, String username, String password){
        clientesMap.put(username, new Cliente(nome, cpf, username, password));
    }

    public void adicionarContaCorrente(int numero, int agencia, double saldo, SignUpSystem signUpSystem, String username){
        contasMap.put(username, new ContaCorrente(numero, agencia, saldo, signUpSystem.getClienteByUsername(username)));
    }

    public void adicionarContaPoupanca (int numero, int agencia, double saldo, SignUpSystem signUpSystem, String username){
        contasMap.put(username, new ContaPoupanca(numero, agencia, saldo, signUpSystem.getClienteByUsername(username)));
    }

    public Conta getContaByUsername(String username){
        Map<String, Conta> contasPorUsername = new LinkedHashMap<>();

        for (Map.Entry<String, Conta> entry : contasMap.entrySet()){
            if (entry.getValue().getTitular().getUsername().equalsIgnoreCase(username)){
                contasPorUsername.put(entry.getKey(), entry.getValue());
            }
        }

        return contasPorUsername.get(username);
    }

    public Cliente getClienteByUsername(String username){

        Map<String, Cliente> clientesPorUsername = new LinkedHashMap<>();

        for (Map.Entry<String, Cliente> entry : clientesMap.entrySet()){
            if(entry.getValue().getUsername().equalsIgnoreCase(username)){
                clientesPorUsername.put(entry.getKey(), entry.getValue());
            }
        }

        return clientesPorUsername.get(username);
    }

    public void removerClientePorUsername(String username){
        clientesMap.remove(username);
    }

    public void removerContaPorUsername(String username){
        contasMap.remove(username);
    }


    public void atualizarCliente (String username, Cliente novoCliente){
        clientesMap.replace(username, novoCliente);
    }

    public void atualizarCliente (String username, Cliente velhoCliente, Cliente novoCliente){
        clientesMap.replace(username, velhoCliente, novoCliente);
    }
    public void atualizarConta(String username, Conta novaConta){
        contasMap.replace(username, novaConta);
    }

    public void atualizarConta(String username, Conta velhaConta, Conta novaConta){
        contasMap.replace(username, velhaConta, novaConta);
    }
    /* Este é um projeto que ainda está em andamento, mas já dá pra ter uma ideia do que ele irá se tornar:
    public void enterSystem(int op, SignUpSystem signUpSystem){
        int input1, input2;

        Scanner s = new Scanner(System.in);
        switch (op){
            case (1):
                exibirMenu2();
                input1 = s.nextInt();
                String a, b, c ,d;
                int numero, agencia;
                double saldo;
                if (input1 == 1){
                    System.out.println("Digite seu nome: ");
                    a = s.nextLine();
                    System.out.println("Digite seu cpf: ");
                    b = s.nextLine();
                    System.out.println("Digite seu nome de usuário: ");
                    c = s.nextLine();
                    System.out.println("Digite sua senha: ");
                    d = s.nextLine();
                    adicionarCliente(a, b, c, d);
                } else if (input1 == 2){
                    System.out.println("Digite o numero da sua conta: ");
                    numero = s.nextInt();
                    s.nextLine();
                    System.out.println("Digite o número da sua agência: ");
                    agencia =s.nextInt();
                    s.nextLine();
                    System.out.println("Digite o valor do seu saldo: ");
                    saldo = s.nextDouble();
                    s.nextLine();
                    System.out.println("Digite seu nome de usuário já cadastrado: ");
                    c = s.nextLine();
                    adicionarContaCorrente(numero, agencia, saldo, signUpSystem, c);
                } else if (input1 == 3) {
                    System.out.println("Digite o numero da sua conta: ");
                    numero = s.nextInt();
                    s.nextLine();
                    System.out.println("Digite o número da sua agência: ");
                    agencia =s.nextInt();
                    s.nextLine();
                    System.out.println("Digite o valor do seu saldo: ");
                    saldo = s.nextDouble();
                    s.nextLine();
                    System.out.println("Digite seu nome de usuário já cadastrado: ");
                    c = s.nextLine();
                    adicionarContaPoupanca(numero, agencia, saldo, signUpSystem, c);
                } else {
                    System.out.println("Você digitou um valor não executável ou digitou o valor 9 para sair do sistema...");
                    break;
                }
                break;
            case (2):
                exibirMenu3();

        }
    }
    public void exibirMenu1(){
        System.out.println("=================================================");
        System.out.println("                  BANCO NACIONAL                 ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("Se não possui conta cadastre-se, se já possui conta efetue o login");
        System.out.println("\n1- Cadastra-se \n2- Efetuar Login \n9- Sair");
        System.out.println("=================================================");
    }

    public void exibirMenu2(){
        System.out.println("=================================================");
        System.out.println("                  BANCO NACIONAL                 ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("OBS.: Você só pode criar uma conta caso já tenha feito o cadastro.");
        System.out.println("\n1- Cadastra-se \n2- Adicionar Conta Corrente" +
                " \n3- Adicionar Conta Poupança \n9- Sair");
        System.out.println("=================================================");
    }

    public void exibirMenu3(){
        System.out.println("=================================================");
        System.out.println("                  BANCO NACIONAL                 ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("\n1- Exibir Seus Dados " +
                "\n2- Excluir Conta \n3- Excluir Cadastro \n4- Atualizar Conta
                \n5- atualizar dados do cliente \n9- Sair");
        System.out.println("=================================================");
    }*/


}
