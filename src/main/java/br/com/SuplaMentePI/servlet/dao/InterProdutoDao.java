package br.com.SuplaMentePI.servlet.dao;



import br.com.SuplaMentePI.servlet.modelos.Categorias;
import br.com.SuplaMentePI.servlet.modelos.Produto;

import java.util.List;
import java.util.Optional;

public interface InterProdutoDao {
    Produto save(Produto produto);
    Produto update(Produto produto);
    void deleta(long id);

    void deleta(Long id);

    List<Produto> findAll();// ira devolver todos os produtos
    Optional<Produto> findById(long id);// ira buscar um produto pelo id
   List<Produto> findByString(String Nome);

    Optional<Produto> findById(Long id);

    List<Produto> findByNome(String nome);

    List<Produto> findByCategoria(Categorias categoria);
}
