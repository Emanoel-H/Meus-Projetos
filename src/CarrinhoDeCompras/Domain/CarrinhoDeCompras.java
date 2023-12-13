package CarrinhoDeCompras.Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem (String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i: itemList) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public void removerItem(int index){
        itemList.remove(index);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        if (!itemList.isEmpty()){
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirMenu(){
        System.out.println("=================================================");
        System.out.println("                CARRINHO DE COMPRAS              ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("\n1- Exibir itens \n2- Adicionar Item" +
                " \n3- Remover Item \n4- Calcular valor total \n9- Sair");
        System.out.println("=================================================");
    }

    public void runClass(int op){
        int a;
        String b;
        double c;
        Scanner s = new Scanner(System.in);
        switch(op) {
            case(1):
                exibirItens();
                break;
            case(2):
                System.out.println("Insira o nome do item: ");
                b = s.nextLine();
                System.out.println("Insira o valor do item: ");
                c = s.nextDouble();
                s.nextLine();
                System.out.println("Insira a quantidade do produto no estoque: ");
                a = s.nextInt();

                adicionarItem(b, c, a);
                break;
            case(3):
                System.out.println("Insira o nome do item que você deseja remover: ");
                b = s.nextLine();
                removerItem(b);
                break;
            case(4):
                System.out.println("O valor total dos itens no estoque é: " + calcularValorTotal());
                break;
            case 9:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Insira uma opção válida (Um número inteiro)");
        }


    }
}
