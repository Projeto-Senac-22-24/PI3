package br.com.SuplaMentePI.servlet;



import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet("/adiciona-produto")
public class CriarSuplaMenteServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.getRequestDispatcher("adiciona-produto.html").forward(req, resp);// mandando a pagina


        try {
            ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}




