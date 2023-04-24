package br.com.SuplaMentePI.servlet;

import br.com.SuplaMentePI.servlet.dao.ProdutoDao;

import java.sql.Connection;
import java.sql.SQLException;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.getConnection;

public class DeletaProduto {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ProdutoDao dao = new ProdutoDao(connection);
        dao.deleta(0l);

    }
}
