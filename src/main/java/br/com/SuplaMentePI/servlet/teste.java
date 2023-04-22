package br.com.SuplaMentePI.servlet;


import br.com.SuplaMentePI.servlet.dao.ProdutoDao;
import br.com.SuplaMentePI.servlet.modelos.Produto;

public class teste {
    public static void main(String [] args){
        ProdutoDao dao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("proteina");
        produto.setQuantidade(2);
        produto.setDescri("dfdsgtehtjtyujkyujttttyttttttttt");
        produto.setValor(99);
        produto.setSabor("morango");
        produto.setTamanho(1);
        //produto.setCategoria(Categorias.cafeina);


        dao.save(produto);
    }

}
