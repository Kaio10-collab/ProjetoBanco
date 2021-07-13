package com.br.zup;

import java.util.ArrayList;

public class CadastroCliente {

    protected String nomeCompleto;
    protected String enderenco;
    protected Integer cpfOuRg;
    protected int senha;
    protected int contaAssociada;
    ArrayList<CadastroCliente> listaCliente = new ArrayList();

    public CadastroCliente() {
    }

    public CadastroCliente(String nomeCompleto, String enderenco, Integer cpfOuRg, int senha, int contaAssociada) {
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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(int contaAssociada) {
        this.contaAssociada = contaAssociada;
    }

    public ArrayList<CadastroCliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<CadastroCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}