package com.br.zup;

public class CadastroCliente extends Pessoa {

    protected int senha;
    protected String pessoaFisica;
    protected String pessoaJuridica;

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

    public String getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(String pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(String pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
}