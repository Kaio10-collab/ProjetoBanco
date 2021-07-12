package com.br.zup;

public class CadastroFuncionario  {

    protected String nomeCompleto;
    protected String enderenco;
    protected String cpfOuRg;
    protected String cargoNaEmpresa;
    protected double salario;
    protected double contaAssociada;

    public CadastroFuncionario(String nomeCompleto, String enderenco, String cpfOuRg, String cargoNaEmpresa, double salario, double contaAssociada) {
        this.nomeCompleto = nomeCompleto;
        this.enderenco = enderenco;
        this.cpfOuRg = cpfOuRg;
        this.cargoNaEmpresa = cargoNaEmpresa;
        this.salario = salario;
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

    public String getCargoNaEmpresa() {
        return cargoNaEmpresa;
    }

    public void setCargoNaEmpresa(String cargoNaEmpresa) {
        this.cargoNaEmpresa = cargoNaEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(double contaAssociada) {
        this.contaAssociada = contaAssociada;
    }
}