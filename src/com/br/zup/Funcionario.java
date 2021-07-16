package com.br.zup;

public class Funcionario extends Pessoa  {

    protected String cargoNaEmpresa;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String cargoNaEmpresa, double salario) {
        this.cargoNaEmpresa = cargoNaEmpresa;
        this.salario = salario;
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