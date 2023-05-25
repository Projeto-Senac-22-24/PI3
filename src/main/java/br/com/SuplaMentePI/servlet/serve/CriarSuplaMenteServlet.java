



package br.com.SuplaMentePI.servlet.serve;



import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;



@WebServlet("/adiciona-produto")
public class CriarSuplaMenteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.getRequestDispatcher("Index.jsp").forward(req, resp);// mandando a pagina


        try {
            ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //resp.sendRedirect("/lista-de-produto");

    }
}
