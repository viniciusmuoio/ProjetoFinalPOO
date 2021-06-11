package Models;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private Fornecedor fornecedor;

    //region getters&setters
    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    //endregion

    public Produto(int codigo, String descricao, int quantidade, double preco, Fornecedor fornecedor) {
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
        setFornecedor(fornecedor);
        setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n " +
                "Descrição: " + descricao + "\n" +
                "Preço: " + preco + "\n" +
                "Quantidade: " + quantidade  + "\n" +
                 "Fornecedor: " + fornecedor;
    }
}
