package Models;

import java.awt.*;

public class Fornecedor {
    private int codigo;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private Contato contato;

    //region Getters&Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContato() {
        return contato.toString();
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    //endregion

    public Fornecedor(int codigo, String razaoSocial, String endereco, String estado, String cidade, Contato contato) {
        setCodigo(codigo);
        setRazaoSocial(razaoSocial);
        setCidade(cidade);
        setEndereco(endereco);
        setEstado(estado);
        setContato(contato);
    }

    public Fornecedor(int codigo, String razaoSocial, String endereco, Contato contato) {
        setCodigo(codigo);
        setRazaoSocial(razaoSocial);
        setCidade("Mogi Mirim");
        setEndereco(endereco);
        setEstado("SP");
        setContato(contato);
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Razão social: " + razaoSocial + "\n" +
                "Endereço: " + endereco + ", cidade: " + cidade + " - " + estado + "\n" +
                "Contato: " + "\n" + contato;
    }
}
