package com.br.zup;

public class CadastroCliente extends Pessoa {

    protected int senha;

    public CadastroCliente() {
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}