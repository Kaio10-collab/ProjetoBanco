package com.br.zup;

public class AtributosCliente extends Pessoa {

    protected int senha;
    protected String pessoaFisicaOuJuridica;

    public AtributosCliente() {
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getPessoaFisicaOuJuridica() {
        return pessoaFisicaOuJuridica;
    }

    public void setPessoaFisicaOuJuridica(String pessoaFisicaOuJuridica) {
        this.pessoaFisicaOuJuridica = pessoaFisicaOuJuridica;
    }
}