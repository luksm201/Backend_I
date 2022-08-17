package com.dh.hoteis.model;

public class Filial {

    private int id;
    private String nome;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private boolean E5Estrelas;

    public Filial(String nome, String rua, int numero, String cidade, String estado, boolean e5Estrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        E5Estrelas = e5Estrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isE5Estrelas() {
        return E5Estrelas;
    }

    public void setE5Estrelas(boolean e5Estrelas) {
        E5Estrelas = e5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", E5Estrelas=" + E5Estrelas +
                '}';
    }
}
