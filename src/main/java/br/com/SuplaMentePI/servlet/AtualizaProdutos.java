package br.com.SuplaMentePI.servlet;

import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.util.Optional;

public class AtualizaProdutos {

    public static void main(String[] args) {
        ProdutoDao dao = new ProdutoDao();

        Optional<Produto> proOptinal = dao.findById(0l);

       Produto produto = proOptinal.get();
        System.out.println(produto.getId());
        System.out.println(produto.getNome());
        System.out.println(produto.getDescri());
        System.out.println(produto.getValor());
        System.out.println(produto.getCategoria());
    }

}
