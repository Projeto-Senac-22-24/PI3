package br.com.SuplaMentePI.servlet.modelos;

public class Produto {

    private Long id;
    private String nome;
    private String descri;
    private double valor;

    private Categorias categoria;

    public Produto(Long id,String nome, String descri, double valor, Categorias categoria) {
        this.id = id;
        this.nome = nome;
        this.descri = descri;
        this.valor = valor;
        this.categoria = categoria;
    }
    public Produto(String nome, String descri, double valor, Categorias categoria) {
      this(null, nome, descri, valor, categoria);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }




}
