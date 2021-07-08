package com.br.zup;

public class CadastroCliente {

    protected String nomeCompleto;
    protected String enderenco;
    protected String cpfOuRg;
    protected double contaAssociada;

    public CadastroCliente() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public boolean setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return false;
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