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



@WebServlet("/Cadastra-Produto")
public class CriarSuplaMenteServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         String produtoName = req.getParameter("produto-Name");
//        //Double produtoValor = Double.valueOf(req.getParameter("produto-valor"));
//        String produtoDescri= req.getParameter("produto-descri");
//
//        Produto produto = new Produto();
//        produto.setNome(produtoName);
//       // produto.setValor(produtoValor);
//        produto.setDescri(produtoDescri);
//        new ProdutoDao().save(produto);


        req.getRequestDispatcher("index.html").forward(req, resp);// mandando a pagina


//        try {
//            ConnectionFactory.getConnection();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }
}






