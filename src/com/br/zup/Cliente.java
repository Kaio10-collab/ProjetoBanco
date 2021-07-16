package com.br.zup;

public class Cliente extends Pessoa {

    protected int senha;
    protected String pessoaFisicaOuJuridica;
    protected Conta conta;

    public Cliente() {
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}