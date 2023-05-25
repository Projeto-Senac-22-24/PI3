package br.com.SuplaMentePI.servlet.faz;




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
import java.util.List;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.getConnection;
@WebServlet("/deletaproduto")
public class DeletaProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ProdutoDao dao = new ProdutoDao(connection);

        dao.deleta(Long.valueOf(id));
        //req.getRequestDispatcher("lista-produto.jsp").forward(req,resp);
        resp.sendRedirect("/lista-de-produto");


    }


}
