package com.projetoemprestimo.entities;

public class Emprestimo {
    private int idEmprestimo;
    private String nomeLivro;
    private String nomeCliente;

    public Emprestimo() {
    }

    public Emprestimo(int idEmprestimo, String nomeLivro, String nomeCliente) {
        this.idEmprestimo = idEmprestimo;
        this.nomeLivro = nomeLivro;
        this.nomeCliente = nomeCliente;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
