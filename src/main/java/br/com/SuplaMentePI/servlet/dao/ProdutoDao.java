

import br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory;
import br.com.SuplaMentePI.servlet.modelos.Categorias;
import br.com.SuplaMentePI.servlet.modelos.Produto;
import br.com.SuplaMentePI.servlet.Config.PoolConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoDao implements InterProdutoDao{
     private final Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;
    }


//    create table Produto(
//            id bigserial primary key,
//            nome varchar(150),
//    descri varchar(500),
//    valor decimal(10, 2),
//    categoria varchar(100)
//);
    @Override
    public Produto save(Produto produto) {

        try {

            String sql= "INSERT INTO Produto (Nome, Descri, Valor, Categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            Connection connection = PoolConfig.getConnection();
            preparedStatement.setString( 1, produto.getNome());

            preparedStatement.setString( 2, produto.getDescri());

            preparedStatement.setDouble( 3, produto.getValor());

            preparedStatement.setString(4,produto.getCategoria().toString());// conversao do enum pro string

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys(); // pra recuperara id criada
            generatedKeys.next();
            produto.setId(generatedKeys.getLong("id"));


           preparedStatement.close(); // pra fechar depois
            generatedKeys.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
        return produto;
    }

    @Override
    public Produto update(Produto produto) {
        try {

            String sql= "UPDATE Produto SET nome = ?, descri = ?, valor = ?, categoria = ? WHERE id = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Connection connection = PoolConfig.getConnection();
          // to respeitando a ordem viu
            preparedStatement.setString( 1, produto.getNome());

            preparedStatement.setString( 2, produto.getDescri());

            preparedStatement.setDouble( 3, produto.getValor());

            preparedStatement.setString(4,produto.getCategoria().toString());

            preparedStatement.setLong( 5,produto.getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException e) {

            throw new RuntimeException(e);
        } ;
        return produto;
    }


    @Override
    public void deleta(Long id) {

        try {

            String sql= "DELETE FROM Produto WHERE id = ?";
            Connection connection = PoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1,id);

            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException e) {

            throw new RuntimeException(e);
        } ;


    }

    @Override
    public List<Produto> findAll() {  // ira listar todos os produtos
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto";

        List<Produto> produtos = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Connection connection = PoolConfig.getConnection();

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String descri = rs.getString("descri");
                double valor = rs.getDouble("valor");
                Categorias categoria = Categorias.valueOf(rs.getString("categoria"));

                Produto produto = new Produto(id, nome, descri, valor, categoria);
                produtos.add(produto);
            }
             preparedStatement.close();
            rs.close();
        } catch (SQLException ex) {
           throw  new RuntimeException(ex);
        }

        return produtos;
    }

    @Override
    public Optional<Produto> findById(Long id) { // ira buscar um produto unico pelo id
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE id = ?";

        Produto produto = null;

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Connection connection = PoolConfig.getConnection();
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
            preparedStatement.close();
            rs.close();

        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }
        return Optional.ofNullable(produto);//so pra caso nao encontre o produto
    }

    @Override
    public List<Produto> findByNome(String nome) { // ira buscar um produtos unico pelo nome
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE nome = ?";

        List<Produto> produtos = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Connection connection = PoolConfig.getConnection();
            preparedStatement.setString(1,nome.toString());

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
            preparedStatement.close();
            rs.close();
        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }

        return produtos;
    }

    @Override
    public List<Produto> findByCategoria(Categorias categoria) { // lista de todos os produtos por categoria
        String sql = "SELECT id, nome, descri, valor, categoria FROM Produto WHERE categoria = ?";

        List<Produto> produtos = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            Connection connection = PoolConfig.getConnection();
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
            preparedStatement.close();
            rs.close();

        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }

        return produtos;
    }
}
