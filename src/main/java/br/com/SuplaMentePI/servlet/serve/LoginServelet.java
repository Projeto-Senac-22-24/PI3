package br.com.SuplaMentePI.servlet.serve;

import br.com.SuplaMentePI.servlet.dao.UserDao;
import br.com.SuplaMentePI.servlet.modelos.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String vai = req.getParameter("vai");
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
//        try{
//            switch (vai){
//                case "loga";
//            }
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);

        boolean isValidUser = new UserDao().verifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", username);

            resp.sendRedirect("adicionaProduto");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("Login.jsp").forward(req, resp);

        }

    }
}
