package com.br.zup;

public class CadastroFuncionario extends Pessoa  {

    protected String cargoNaEmpresa;
    protected double salario;

    public CadastroFuncionario() {
    }

    public CadastroFuncionario(String cargoNaEmpresa, double salario) {
        this.cargoNaEmpresa = cargoNaEmpresa;
        this.salario = salario;
    }

    public CadastroFuncionario(String kaio_sanches, String rua_fulano_de_tal, String s, String caixa, int i, int i1) {
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
}