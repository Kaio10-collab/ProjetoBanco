package com.br.zup.model;

import com.br.zup.service.ContaService;


public class Cliente {

    public String nome;
    public String cpf;
    public int senha;
    public int id;
    public String endereco;
    public ContaService conta;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ContaService getConta() {
        return conta;
    }

    public void setConta(ContaService conta) {
        this.conta = conta;
    }
}