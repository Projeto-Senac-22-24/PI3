package br.com.SuplaMentePI.servlet.faz;

import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
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

    }

}


//    Connection connection = ConnectionFactory.getConnection();
//
//    ProdutoDao dao = new ProdutoDao(connection);
//    Optional<Produto> optional = dao.findById(1L);
//
//        optional.ifPresent(at -> {
//                at.setDescri("Descrição atualizada");
//                at.setValor(78);
//                dao.update(at);
//                });
//
//                connection.close();
//                }