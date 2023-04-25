package br.com.SuplaMentePI.servlet;

import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.getConnection;

public class AtualizaProdutos {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ProdutoDao dao = new ProdutoDao(connection);


        Optional<Produto> proOptinal = dao.findById(0l);

       Produto produto = proOptinal.get();
        System.out.println(produto.getId());
        System.out.println(produto.getNome());
        System.out.println(produto.getDescri());
        System.out.println(produto.getValor());
        System.out.println(produto.getCategoria());

        // testando o atualiza
//        produto.setDescri("faz bem pra saude");
//        produto.setNome("Cafe");
//        produto.setValor(25.89);
//        produto.setCategoria(Categorias.Proteínas);
//
  //      dao.update(produto);

    }

}
