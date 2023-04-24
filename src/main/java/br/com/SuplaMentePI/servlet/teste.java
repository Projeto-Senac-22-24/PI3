package br.com.SuplaMentePI.servlet;


import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Categorias;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.util.List;
import java.util.Optional;

public class teste {
    public static void main(String [] args){
        ProdutoDao dao = new ProdutoDao();


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
//        Produto produto = new Produto();
//        produto.setNome("cafe");
//        produto.setDescri("isso meso");
//        produto.setValor(100.20);
//        produto.setCategoria(Categorias.Proteínas);
//
//
//        Produto inserido = dao.save(produto);
//        System.out.println("adicionado no banco com o id: " + inserido.getId());// so pra ver se foi inserido no banco

    }

}
