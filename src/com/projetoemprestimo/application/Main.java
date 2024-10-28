package com.projetoemprestimo.application;

import com.projetoemprestimo.entities.Cliente;
import com.projetoemprestimo.entities.Emprestimo;
import com.projetoemprestimo.entities.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void telaInicial(){
        System.out.println("BEM VINDO Á BIBLIOTECA \n1.Cadastrar novo cliente \n2.Cadastrar novo livro \n3.Listar livros \n4.Emprestar livro \n0. Sair");
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
        int menu;
        do {
            telaInicial();
            menu = read.nextInt();
            switch(menu){
                case 1:
                    clientes = c.cadastrarCliente(clientes);

                    System.out.println("Lista de clientes: ");
                    /* teste do cadastro */
                    for (int i = 0; i < clientes.size(); i++){
                        System.out.println("Cliente " + (i + 1) + " : ");
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("Email: " + clientes.get(i).getEmail());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                    }
                    break;
                case 2:
                    livros = l.cadastrarLivro(livros);
                    break;
                case 3:
                    System.out.println("1. Listar todos os livros. \n2. Listar livros disponíveis. \n3. Voltar ao menu.");
                    menu = read.nextInt();
                    switch(menu){
                        case 1:
                            l.listarTodos(livros);
                            break;
                        case 2:
                            l.listarDisponiveis(livros);
                            break;
                        case 3:
                            System.out.println("Voltando ao menu...");
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                            break;
                    }
                    break;
                case 4:
                    //emprestar livro
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while(menu != 0);
    }
}
