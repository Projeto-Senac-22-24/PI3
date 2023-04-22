package br.com.SuplaMentePI.servlet;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet("/criar-SuplaMente")
public class CriarSuplaMenteServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String SuplaName = req.getParameter("Supla-name");

        System.out.println(SuplaName);

        req.getRequestDispatcher("index.html").forward(req, resp);


       //ConnectionFactory.getConnection();

    }
}






