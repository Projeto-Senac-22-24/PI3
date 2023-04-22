package br.com.SuplaMentePI.servlet.modelos;

public class Produto {

    private long id;
    private String Nome;
    private String Descri;
    private double Quantidade;
    private double Tamanho;
    private String Sabor;
    private double Valor;
    // private Categorias categoria;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double getTamanho() {
        return Tamanho;
    }

    public void setTamanho(double tamanho) {
        Tamanho = tamanho;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

  /*  public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    } */




}
