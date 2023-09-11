package CarrinhoDeCompras.Test;


import CarrinhoDeCompras.Domain.CarrinhoDeCompras;

import java.util.Scanner;

public class CarrinhoDeComprasTeste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Scanner sc = new Scanner(System.in);

        //Adicionando itens ao carrinho:
        carrinho.adicionarItem("Banana da Prata", 2.50, 2);
        carrinho.adicionarItem("Ovos", 17.75, 2);
        carrinho.adicionarItem("Aveia", 5.95, 6);
        carrinho.adicionarItem("Leite desnatado", 6.99, 8);

        //Removendo item da lista:
        carrinho.removerItem("Leite desnatado");

        //Calculando o preço dos itens:
        System.out.println(carrinho.calcularValorTotal());

        //exibindo itens:
        carrinho.exibirItens();
    }
}
