package OrdenacaoDeNumeros.Test;


import OrdenacaoDeNumeros.Domain.OrdenacaoNumeros;

public class OrdenacaoNumerosTest {
    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();

        // Adicionando números:
        on.adicionarNumero(25);
        on.adicionarNumero(40);
        on.adicionarNumero(35);
        on.adicionarNumero(50);

        // Sorting números:
        System.out.println("Ordem Crescente");
        System.out.println(on.ordenarAscendente());
        System.out.println("Ordem Descendente:");
        System.out.println(on.ordenarDescendente());

        System.out.println("Ordem natural");
        on.exibirNumeros();
    }
}
