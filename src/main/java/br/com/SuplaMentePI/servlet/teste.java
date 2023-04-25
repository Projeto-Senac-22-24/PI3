package br.com.SuplaMentePI.servlet;


import br.com.SuplaMentePI.servlet.dao.ProdutoDao;

import java.sql.Connection;
import java.sql.SQLException;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.getConnection;

public class teste {
    public static void main(String [] args){
        Connection connection = null;
        try {
            connection = getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ProdutoDao dao = new ProdutoDao(connection);


      // teste do buscar por categoria
//        List<Produto> produtos = dao.findByCategoria(Categorias.Carboidratos);
//        for (Produto produto : produtos) {
//            System.out.println("Id: " + produto.getId());
//            System.out.println("Nome: " + produto.getNome());
//            System.out.println("Descrição: " + produto.getDescri());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria());
//
//            System.out.println("****************");
//        }

 // teste do busca por nome
//        List<Produto> produtos = dao.findByString("rge");
//        for (Produto produto : produtos) {
//            System.out.println("Id: " + produto.getId());
//            System.out.println("Nome: " + produto.getNome());
//            System.out.println("Descrição: " + produto.getDescri());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria());
//
//            System.out.println("****************");
//        }

 // teste do busca por id
//        Optional<Produto> byId = dao.findById(0l);
//        byId.ifPresent(produto -> {
//            System.out.println("Id: " + produto.getId());
//            System.out.println("Nome: " + produto.getNome());
//            System.out.println("Descrição: " + produto.getDescri());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria());
//
//            System.out.println("****************");
//        });

        // teste da lista
//        List<Produto> produtos = dao.findAll();
//
//        for (Produto produto : produtos) {
//            System.out.println("Id: " + produto.getId());
//            System.out.println("Nome: " + produto.getNome());
//            System.out.println("Descrição: " + produto.getDescri());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria());
//
//            System.out.println("****************");
//        }

// tava testando colocar um produto
//        Produto produto = new Produto ();
//
//        produto.setNome("luz");
//        produto.setDescri("gfgdfdfhdfhfdhfh");
//        produto.setValor(20);
//        produto.setCategoria(Categorias.Termogênicos);
//
//
//        Produto inserido = dao.save(produto);
//        System.out.println("adicionado no banco com o id: " + inserido.getId());// so pra ver se foi inserido no banco

    }

}
