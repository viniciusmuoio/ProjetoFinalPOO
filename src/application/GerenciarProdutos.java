package application;

import Models.Cesta;
import Models.Contato;
import Models.Fornecedor;
import Models.Produto;

import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {

    public static void main(String[] args) {

        var cod = 1;
        var razaoSocial = "POO express";
        var endereco = "Av. Brasil - 499";
        var cidade = "Mogi Guaçu";
        var estado = "SP";
        var nome = "Ana";
        var email = "ana@teste.com";
        var telefone = "912672424";
        Contato contato = new Contato();
        contato.setEmail(email);
        contato.setNome(nome);
        contato.setTelefone(telefone);
        Fornecedor fornecedor = new Fornecedor(cod, razaoSocial, endereco, estado, cidade, contato);
        System.out.println(fornecedor);

        cod = 2;
        razaoSocial = "R7";
        endereco = "Av. Rui Barbosa - 699";
        nome = "Vinicius";
        email = "vinicius@teste.com";
        telefone = "912672525";
        Contato contato2 = new Contato();
        contato2.setEmail(email);
        contato2.setNome(nome);
        contato2.setTelefone(telefone);
        Fornecedor fornecedor2 = new Fornecedor(cod, razaoSocial, endereco, contato);
        System.out.println(fornecedor2);

        var codProduto = 01;
        var quantidade = 1;
        var descricao = "TV 49pol";
        var preco = 1999.90;
        Produto produto = new Produto(codProduto, descricao, quantidade, preco, fornecedor2);

        codProduto = 02;
        quantidade = 2;
        descricao = "TV 60pol";
        preco = 2999.90;
        Produto produto2 = new Produto(codProduto, descricao, quantidade, preco, fornecedor);

        Cesta cesta = new Cesta();
        cesta.adicionarItem(produto);
        cesta.adicionarItem(produto2);
        System.out.println(cesta.exibirLista());
    }
}