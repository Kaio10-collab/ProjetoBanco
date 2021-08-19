package com.br.zup.controller;

import com.br.zup.service.ClienteService;

public class ClienteController {

    ClienteService clienteService = new ClienteService();

    public void add(Cliente cliente) {
        this.clienteService.add(cliente);
    }

    public Cliente findByName(String nome) {
        Cliente clienteDoRepositorio = null;

        clienteDoRepositorio = this.clienteService.findByName(nome);

        return clienteDoRepositorio;
    }

    public Cliente findByCpf(String cpf) {
        Cliente clienteDoRepositorio = null;

        clienteDoRepositorio = this.clienteService.findByCpf(cpf);

        return clienteDoRepositorio;
    }

    public void update(Cliente cliente) {
        this.clienteService.update(cliente);
    }

    public void delete(Cliente cliente) {
        this.clienteService.delete(cliente);
    }
}