package com.br.zup.controller;

import com.br.zup.service.ContaService;

public class ContaController {

    ContaService contaService = new ContaService();

    public void deposita(int id, double valor){
        this.clienteService.deposita(id, valor);
    }

    public void saca(int id, double valor){
        this.clienteService.saca(id, valor);
    }

    public void transfere(int id,String cpf, double valor){
        this.clienteService.transfere(id, cpf, valor);
    }
}
