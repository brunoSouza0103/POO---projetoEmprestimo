package com.projetoemprestimo.entities;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String situacao;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, String situacao) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.situacao = situacao;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
