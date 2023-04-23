package br.com.SuplaMentePI.servlet.modelos;

public class Produto {

    private long id;
    private String Name;
    private String Descri;
    private double Valor;

    private Categorias categoria;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Name;
    }

    public void setNome(String nome) {
        Name = nome;
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
