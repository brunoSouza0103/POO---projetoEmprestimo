package com.projetoemprestimo.application;

import com.projetoemprestimo.entities.Cliente;
import com.projetoemprestimo.entities.Emprestimo;
import com.projetoemprestimo.entities.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void telaInicial(){
        System.out.println("BEM VINDO Á BIBLIOTECA \n1.Cadastrar novo cliente \n2.Cadastrar novo livro \n3.Listar livros \n4.Emprestar livro");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        /*declaração de objetos*/
        Cliente c = new Cliente();
        Livro l = new Livro();
        Emprestimo e = new Emprestimo();

        /*declaração de listas*/
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        /*execução do programa*/
        telaInicial();
        int menu = read.nextInt();
        switch(menu){
            case 1:
                //cadastrar usuario
                break;
            case 2:
                //cadastrar novo ivro
                break;
            case 3:
                //listar livros
                break;
            case 4:
                //emprestar livro
                break;
            default:

        }
    }
}
