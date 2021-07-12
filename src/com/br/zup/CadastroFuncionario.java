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

}