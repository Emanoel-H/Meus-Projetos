package CarrinhoDeCompras.Domain;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(itemList);

    }

}
