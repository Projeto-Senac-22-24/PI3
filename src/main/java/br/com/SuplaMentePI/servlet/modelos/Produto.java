package br.com.SuplaMentePI.servlet.modelos;

public class Produto {

    private Long id;
    private String Nome;
    private String Descri;
    private double Valor;

    private Categorias categoria;

    public Produto(Long id,String nome, String descri, double valor, Categorias categoria) {
        this.id = id;
        this.Nome = nome;
        this.Descri = descri;
        this.Valor = valor;
        this.categoria = categoria;
    }
    public Produto(String nome, String descri, double valor, Categorias categoria) {
      this((null), nome, descri, valor, categoria);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescri() {
        return Descri;
    }

    public void setDescri(String descri) {
        Descri = descri;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }




}
