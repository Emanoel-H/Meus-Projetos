package BankSystem.Domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SignUpSystem {
    //Este é um projeto que ainda está em andamento, mas já dá pra ter uma ideia do que ele irá se tornar
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

    /* Esse método não funcionou, ainda não descobri o motivo então vai ficar inativo por um tempo.
    public void atualizarCliente (String username, Cliente novoCliente){
        clientesMap.replace(username, novoCliente);
    }

    public void atualizarCliente (String username, Cliente velhoCliente, Cliente novoCliente){
        clientesMap.replace(username, velhoCliente, novoCliente);
    }*/
    public void atualizarConta(String username, Conta novaConta){
        contasMap.replace(username, novaConta);
    }

    public void atualizarConta(String username, Conta velhaConta, Conta novaConta){
        contasMap.replace(username, velhaConta, novaConta);
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
        System.out.println("\n1- Cadastra-se \n2- Criar Conta Corrente" +
                " \n3- Criar Conta Poupança  \n4- Atualizar Conta \n9- Sair");
        System.out.println("=================================================");
    }

    public void exibirMenu3(){
        System.out.println("=================================================");
        System.out.println("                  BANCO NACIONAL                 ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("\n1- Exibir Seus Dados " +
                "\n2- Excluir Conta \n3- Excluir Cadastro \n9- Sair");
        System.out.println("=================================================");
    }


}
