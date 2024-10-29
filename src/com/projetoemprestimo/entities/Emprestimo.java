package com.projetoemprestimo.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
    Scanner read = new Scanner(System.in);
    private String nomeLivro;
    private String nomeCliente;

    public Emprestimo() {
    }

    public Emprestimo(String nomeLivro, String nomeCliente) {
        this.nomeLivro = nomeLivro;
        this.nomeCliente = nomeCliente;
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

    public ArrayList emprestarLivro(ArrayList<Livro> livros, ArrayList<Emprestimo> emprestimos) {
        boolean z = false;
        int option = 0;
        String nomeCliente;
        String nomeLivro;
        for (Livro value : livros) {
            if (value.getSituacao().equals("Disponível")) {
                z = true;
                break;
            }
        }
        if (z) {
            System.out.println("LIVROS DISPONÍVEIS:");
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getSituacao().equals("Disponível")) {
                    System.out.println((i + 1) + ". ");
                    System.out.println("Nome do Livro: " + livros.get(i).getNomeLivro());
                    System.out.println("Nome do Autor: " + livros.get(i).getAutorLivro());
                    System.out.println("Situação do Livro: " + livros.get(i).getSituacao());
                    System.out.println();
                }
            }
            System.out.println("Digite uma opção para emprestar:");
            option = (read.nextInt() - 1);
            System.out.println("Digite o nome do reponsável: ");
            read.next();
            nomeCliente = read.nextLine();

            livros.get(option).setSituacao("Emprestado");
            nomeLivro = livros.get(option).getNomeLivro();
            Emprestimo e = new Emprestimo(nomeCliente, nomeLivro);
            emprestimos.add(e);

            System.out.println("Livro " + option + " emprestado com sucesso!");
        } else System.out.println("Nenhum livro disponível!");
        return emprestimos;
    }
}
