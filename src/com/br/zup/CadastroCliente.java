package com.br.zup;

public class CadastroCliente {

    protected String nomeCompleto;
    protected String enderenco;
    protected String cpfOuRg;
    protected String contaAssociada;

    public CadastroCliente() {
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

    public String getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(String contaAssociada) {
        this.contaAssociada = contaAssociada;
    }
}