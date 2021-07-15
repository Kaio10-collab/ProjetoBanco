package com.br.zup;

public class CadastroCliente extends Pessoa {

    protected int senha;

    public CadastroCliente() {
    }

    public CadastroCliente(String nome, String endereco, int parseInt, int parseInt1, int id) {
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}