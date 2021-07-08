package com.br.zup;

public class CadastroFuncionario extends CadastroCliente {

    protected String cargoNaEmpresa;
    protected double salario;

    public CadastroFuncionario() {
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