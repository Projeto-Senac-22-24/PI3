package br.com.SuplaMentePI.servlet.dao;


import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.*;

public class ProdutoDao implements InterProdutoDao{

    @Override
    public Produto save(Produto produto) {
        try(Connection connection = getConnection()) {
            String sql= "INSERT INTO Produto (id, Nome, Descri, Valor) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong( 1, produto.getId());
            preparedStatement.setString( 2, produto.getNome());
            preparedStatement.setString( 3, produto.getDescri());
            preparedStatement.setDouble( 4, produto.getValor());



            preparedStatement.executeUpdate();
            System.out.println("Conectado");
            preparedStatement.close(); // pra fechar depois
        } catch (SQLException e) {
            System.out.println("nao conectado");
            throw new RuntimeException(e);
        } ;
        return produto;
    }

    @Override
    public Produto update(Produto produto) {
        return null;
    }

    @Override
    public void deleta(long id) {

    }

 /*   @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public Optional<Produto> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Produto> findByString(String Nome) {
        return Optional.empty();
    }

    @Override
    public List<Produto> findByCategoria(Categorias categoria) {
        return null;
    } */
}
