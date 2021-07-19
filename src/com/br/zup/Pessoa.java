package com.br.zup;

public class Pessoa {

    protected String nomeCompleto;
    protected String enderenco;
    protected String cpfOuRg;
    protected double contaAssociada;

    public Pessoa() {
    }

    public Pessoa(String nomeCompleto, String enderenco, String cpfOuRg, double contaAssociada) {
        this.nomeCompleto = nomeCompleto;
        this.enderenco = enderenco;
        this.cpfOuRg = cpfOuRg;
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

    public String getCpfOuRg() {
        return cpfOuRg;
    }

    public void setCpfOuRg(String cpfOuRg) {
        this.cpfOuRg = cpfOuRg;
    }

    public double getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(double contaAssociada) {
        this.contaAssociada = contaAssociada;
    }
}