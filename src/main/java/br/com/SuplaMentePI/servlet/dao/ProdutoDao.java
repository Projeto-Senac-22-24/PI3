package br.com.SuplaMentePI.servlet.dao;


import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.modelos.Categorias;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory.*;

public class ProdutoDao implements InterProdutoDao{

    @Override
    public Produto save(Produto produto) {

        try(Connection connection = getConnection()) {

            String sql= "INSERT INTO Produto (Nome, Descri, Valor,categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString( 1, produto.getNome());

            preparedStatement.setString( 2, produto.getDescri());

            preparedStatement.setDouble( 3, produto.getValor());

            preparedStatement.setString(4,produto.getCategoria().toString());// conversao do enum pro string

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys(); // pra recuperara id criada
            generatedKeys.next();
            produto.setId(generatedKeys.getLong("Id"));


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
// tiago faz
    }

    @Override
    public List<Produto> findAll() {  // ira listar todos os produtos
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto";

        List<Produto> produtos = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();// permite fazer uma busca

            while (rs.next()){
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String descri = rs.getString("descri");
                double valor = rs.getDouble("valor");
                Categorias categoria = Categorias.valueOf(rs.getString("categoria"));

                Produto produto = new Produto(id, nome, descri, valor, categoria);
                produtos.add(produto);
            }

        } catch (SQLException ex) {
           throw  new RuntimeException(ex);
        }

        return produtos;

    }

    @Override
    public Optional<Produto> findById(long id) { // ira buscar um produto unico pelo id
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE id = ?";

        Produto produto = null;

        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            ResultSet rs = preparedStatement.executeQuery();// permite fazer uma busca

            while (rs.next()){
                Long primeKey = rs.getLong("id");
                String nome = rs.getString("nome");
                String descri = rs.getString("descri");
                double valor = rs.getDouble("valor");
                Categorias categoria = Categorias.valueOf(rs.getString("categoria"));

                produto = new Produto(primeKey, nome, descri, valor, categoria);

            }

        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }
        return Optional.ofNullable(produto);//so pra caso nao encontre o produto
    }

    @Override
    public List<Produto> findByString(String nome) { // ira buscar um produtos unico pelo nome
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE nome = ?";

        List<Produto> produtos = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,nome);

            ResultSet rs = preparedStatement.executeQuery();// permite fazer uma busca

            while (rs.next()){
                Long id = rs.getLong("id");
                String nm = rs.getString("nome");
                String descri = rs.getString("descri");
                double valor = rs.getDouble("valor");
                Categorias categoria = Categorias.valueOf(rs.getString("categoria"));

                Produto produto = new Produto(id, nm, descri, valor, categoria);
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }

        return produtos;
    }

    @Override
    public List<Produto> findByCategoria(Categorias categoria) { // lista de todos os produtos por categoria
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE categoria = ?";

        List<Produto> produtos = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,categoria.toString());

            ResultSet rs = preparedStatement.executeQuery();// permite fazer uma busca

            while (rs.next()){
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String descri = rs.getString("descri");
                double valor = rs.getDouble("valor");
                Categorias ctg = Categorias.valueOf(rs.getString("categoria"));

                Produto produto = new Produto(id, nome, descri, valor, ctg);
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }

        return produtos;
    }
}
