package com.projetoemprestimo.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    static Scanner read = new Scanner(System.in);

    private String nomeLivro;
    private String autorLivro;
    private String situacao;

    public Livro() {
    }

    public Livro(String nomeLivro, String autorLivro, String situacao) {
        this.nomeLivro = nomeLivro;
        this.situacao = situacao;
        this.autorLivro = autorLivro;
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

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public ArrayList<Livro> cadastrarLivro(ArrayList<Livro> livros) {
        Livro l = new Livro();
        System.out.println("Nome do livro: ");
        String nome = read.nextLine();
        l.setNomeLivro(nome);

        System.out.println("Autor do livro: ");
        String autor = read.nextLine();
        l.setAutorLivro(autor);

        System.out.println("Situação do livro: ");
        String situacao = read.nextLine();
        l.setSituacao(situacao);
        livros.add(l);

        return livros;
    }

    public void listarTodos(ArrayList<Livro> livros) {
        if (!livros.isEmpty()) {
            System.out.println("LIVROS EXISTENTES:");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("Nome do Livro: " + livros.get(i).getNomeLivro());
                System.out.println("Nome do Autor: " + livros.get(i).getAutorLivro());
                System.out.println("Situação do Livro: " + livros.get(i).getSituacao());
                System.out.println();
            }
        }else System.out.println("Nenhum livro cadstrado no sistema!");
    }

    public void listarDisponiveis(ArrayList<Livro> livros) {
        boolean z = false;
        for (Livro value : livros) {
            if (value.getSituacao().equals("Disponível")) {
                z = true;
                break;
            }
        }
        if(z) {
            System.out.println("LIVROS DISPONÍVEIS:");
            for (Livro livro : livros) {
                if (livro.getSituacao().equals("Disponível")) {
                    System.out.println("Nome do Livro: " + livro.getNomeLivro());
                    System.out.println("Nome do Autor: " + livro.getAutorLivro());
                    System.out.println("Situação do Livro: " + livro.getSituacao());
                    System.out.println();
                }
            }
        }else System.out.println("Nenhum livro disponível!");
    }
}
