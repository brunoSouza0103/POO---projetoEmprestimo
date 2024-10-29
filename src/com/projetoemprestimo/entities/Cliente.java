package com.projetoemprestimo.entities;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public boolean validarEmail(String email){
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validarCpf(String cpf){
        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }

    public ArrayList<Cliente> cadastrarCliente(ArrayList<Cliente> clientes){
        Cliente c = new Cliente();
        String email, cpf;
        System.out.println("Nome do cliente: ");
        String nome = read.nextLine();
        c.setNome(nome);

        do {
            System.out.println("Email do cliente: (exemplo: ####@#####.###)");
            email = read.nextLine();
        }while(!validarEmail(email));
        do {
            System.out.println("Cpf do cliente: (exemplo: ###.###.###-##)");
            cpf = read.nextLine();
        }while(!validarCpf(cpf));

        c.setEmail(email);
        c.setCpf(cpf);
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");

        return clientes;
    }
}
