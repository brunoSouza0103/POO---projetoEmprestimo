package com.projetoemprestimo.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    static Scanner read = new Scanner(System.in);

    /* atributos referentes a classe cliente */
    private String nome;
    private String email;
    private String cpf;

    /* construtores */
    public Cliente() {
    }

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    /* getters e setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /* Funções */
    public ArrayList<Cliente> cadastrarCliente(ArrayList<Cliente> clientes){
        Cliente c = new Cliente();
        System.out.println("Nome do cliente: ");
        String nome = read.nextLine();
        c.setNome(nome);

        System.out.println("Email do cliente: ");
        String email = read.nextLine();
        c.setEmail(email);

        System.out.println("Cpf do cliente: ");
        String cpf = read.nextLine();
        c.setCpf(cpf);
        clientes.add(c);

        return clientes;
    }
}
