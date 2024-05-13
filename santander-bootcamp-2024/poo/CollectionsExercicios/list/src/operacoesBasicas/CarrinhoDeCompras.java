package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> ItensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    ItensParaRemover.add(i);
                }
            }
            itemList.removeAll(ItensParaRemover);
        }else{
            System.out.println("Lista vazia");
        }
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public void exibirItens(){
        System.out.println(itemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Lápis", 2d, 3);
        carrinho.adicionarItem("Lápis", 2d, 3);
        carrinho.adicionarItem("Caderno", 35d, 1);
        carrinho.adicionarItem("Borracha", 2d, 2);

        carrinho.exibirItens();
        carrinho.removerItem("Lápis");
        carrinho.exibirItens();
        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
    }
}
