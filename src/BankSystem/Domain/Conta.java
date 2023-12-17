package BankSystem.Domain;

public abstract class Conta extends Object {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente titular;

    public Conta() {
    }

    public Conta(int numero, int agencia, double saldo, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    protected void depositar(double valor, Conta conta){
        var deposito = conta.getSaldo() + valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor, Conta conta){
        var saque = conta.getSaldo() - valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void transferir(Conta origem, Conta destino, double valor){
        origem.sacar(valor);
        destino.depositar(valor);
    }

    public void transferir(ContaCorrente origem, ContaPoupanca destino, double valor){
        origem.sacar(valor);
        destino.depositar(valor);
    }

    public void transferir(ContaPoupanca origem, ContaCorrente destino, double valor){
        origem.sacar(valor);
        destino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
