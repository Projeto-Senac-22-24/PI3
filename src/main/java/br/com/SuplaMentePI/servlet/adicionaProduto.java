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

@WebServlet("/adicionaProduto")
public class adicionaProduto extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String NomeStr = req.getParameter("Nome");
        String SaborStr = req.getParameter("Sabor");
        String TamanhoStr = req.getParameter("Tamanho");
        String QuantidadeStr = req.getParameter("Quantidade");
        String ValorStr = req.getParameter("Valor");
        String DescriStr = req.getParameter("Descri");

        double Valor = Double.parseDouble(ValorStr);
        double Tamanho = Double.parseDouble(TamanhoStr);
        double Quantidade = Double.parseDouble(QuantidadeStr);

      Produto produto = new Produto();


        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ProdutoDao dao = new ProdutoDao();

         dao.save(produto);
    }

}