package com.br.zup;

public class CadastroCliente {

    protected String nomeCompleto;
    protected String enderenco;
    protected Integer cpfOuRg;
    protected double senha;
    protected double contaAssociada;

    public CadastroCliente() {
    }

    public CadastroCliente(String nomeCompleto, String enderenco, int cpfOuRg, double senha, double contaAssociada) {
        this.nomeCompleto = nomeCompleto;
        this.enderenco = enderenco;
        this.cpfOuRg = cpfOuRg;
        this.senha = senha;
        this.contaAssociada = contaAssociada;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    public Integer getCpfOuRg() {
        return cpfOuRg;
    }

    public void setCpfOuRg(Integer cpfOuRg) {
        this.cpfOuRg = cpfOuRg;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(double senha) {
        this.senha = senha;
    }

    public double getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(double contaAssociada) {
        this.contaAssociada = contaAssociada;
    }
}