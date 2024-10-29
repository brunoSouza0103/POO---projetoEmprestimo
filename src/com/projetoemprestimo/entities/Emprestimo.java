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
            nomeCliente = read.next();

            livros.get(option).setSituacao("Emprestado");
            nomeLivro = livros.get(option).getNomeLivro();
            Emprestimo e = new Emprestimo();
            e.setNomeLivro(nomeLivro);
            e.setNomeCliente(nomeCliente);
            emprestimos.add(e);

            System.out.println("Livro " + option + 1 + " emprestado com sucesso!");
        } else System.out.println("Nenhum livro disponível!");
        return emprestimos;
    }

    public ArrayList devolverLivro(ArrayList<Livro> livros, ArrayList<Emprestimo> emprestimos){
        boolean z = false;
        for (Livro livro : livros) {
            if (livro.getSituacao().equals("Emprestado")) {
                z = true;
                break;
            }
        }
        if(z) {
            System.out.println("LIVROS EMPRESTADOS:");
            for (int i = 0; i < emprestimos.size(); i++) {
                System.out.println((i+1) + ". ");
                System.out.println("Nome do livro: " + emprestimos.get(i).getNomeLivro());
                System.out.println("Nome do responsável: " + emprestimos.get(i).getNomeCliente());
            }
            System.out.println("Digite uma opção para devolver: ");
            int option = (read.nextInt() - 1);
            String nomeLivro = emprestimos.get(option).getNomeLivro();
            emprestimos.remove(option);
            System.out.println("Livro devolvido com sucesso!");

            for (Livro livro : livros){
                if(livro.getNomeLivro().equals(nomeLivro)){
                    livro.setSituacao("Disponível");
                }
            }
        }else System.out.println("Nenhum livro emprestado!");
        return emprestimos;
    }
}
