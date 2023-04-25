package br.com.SuplaMentePI.servlet;



import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Categorias;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.getConnection;

@WebServlet("/adicionaProduto")
public class adicionaProduto extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeStr = req.getParameter("Nome");
        String descriStr = req.getParameter("Descri");
        String valorStr = req.getParameter("Valor");
        String categoriaStr = req.getParameter("categoria");

        double valor = Double.parseDouble(valorStr);
        Categorias categoria = Categorias.valueOf(categoriaStr);

      Produto produto = new Produto(nomeStr, descriStr, valor, categoria);

        Connection connection = null;
        try {
            connection = getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ProdutoDao dao = new ProdutoDao(connection);
        dao.save(produto);

    }

}
