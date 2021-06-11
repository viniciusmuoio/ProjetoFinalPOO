package Models;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cesta {
    private List<Produto> produtos = new ArrayList<Produto>();

    //region Funções públicas
    public void adicionarItem(Produto produto){
        produtos.add(produto);
    }

    public String exibirLista(){
        String text = "";
        for (Produto produto: produtos){
            text += produto.getDescricao() + ", qtd:" + produto.getQuantidade() + "\n";
        }
        NumberFormat total = NumberFormat.getCurrencyInstance(Locale.US);
        text += total.format(calcularTotal());

        return text;
    }
    //endregion

    //region Funções privadas
    private double calcularTotal(){
        var total = 0.0;
        for (Produto produto: produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }

        return total;
    }
    //endregion
}
