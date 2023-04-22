package br.com.SuplaMentePI.servlet.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection() throws SQLException{
        try {
            return  DriverManager.getConnection("jdbc:mysql://localhost:3306/Teste", "root", "0000");
        } catch (SQLException e) {
           return null;

        }
    }
}