package BankSystem.Domain;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, int agencia, double saldo, Cliente titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + getNumero() + " Agência: " + getAgencia()
                + " Saldo: " + getSaldo() + " Titular: " + getTitular().getNome();
    }
}
