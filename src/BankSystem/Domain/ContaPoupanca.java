package BankSystem.Domain;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, int agencia, double saldo, Cliente titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + getNumero() + " Agência: " + getAgencia()
                + " Saldo: " + getSaldo() + " Titular: " + getTitular().getNome();
    }

}
