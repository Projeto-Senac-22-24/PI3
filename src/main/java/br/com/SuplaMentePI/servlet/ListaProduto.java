package br.com.SuplaMentePI.servlet;

import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/ListaProduto")
public class ListaProduto  extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ProdutoDao dao = new ProdutoDao(connection);
        List<Produto> produtos = dao.findAll();

        req.setAttribute("produtos", produtos);

      req.getRequestDispatcher("/lista-produto.jsp").forward(req,resp);


        }
    }

