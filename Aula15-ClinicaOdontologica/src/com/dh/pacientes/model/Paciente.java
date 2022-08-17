package com.dh.pacientes.model;

public class Paciente {

    private int id;
    private String nome;
    private String sobrenome;
    private String RG;
    private String endereco;

    public Paciente(String nome, String sobrenome, String RG, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.endereco = endereco;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", RG='" + RG + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
