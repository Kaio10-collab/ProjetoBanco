package com.br.zup.controller;

import com.br.zup.service.FuncionarioService;

public class FuncionarioController {

    FuncionarioService funcionarioService = new FuncionarioService();

    public void add(Funcionario funcionario) {
        this.funcionarioService.add(funcionario);
    }

    public Funcionario findByName(String nome) {
        Funcionario funcionarioDoRepositorio = null;
        funcionarioDoRepositorio = this.funcionarioService.findByName(nome);
        return funcionarioDoRepositorio;
    }

    public Funcionario findByCpf(String cpf) {
        Funcionario funcionarioDoRepositorio = null;
        funcionarioDoRepositorio = this.funcionarioService.findByCpf(cpf);
        return funcionarioDoRepositorio;
    }

    public void update(Funcionario funcionario) {
        this.funcionarioService.update(funcionario);
    }

    public void delete(Funcionario funcionario) {
        this.funcionarioService.delete(funcionario);
    }
}