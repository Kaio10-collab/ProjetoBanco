package com.br.zup;

import java.util.Scanner;

public class CadastroCliente {

    public Cliente cadastrarCliente(){

        Cliente cliente = new Cliente();
        Scanner dadosCliente = new Scanner(System.in);

        System.out.println("digite seu nome completo:");
        cliente.nomeCompleto = dadosCliente.nextLine();
        System.out.println("Digite o documento cpf ou rg:");
        cliente.cpfOuRg = dadosCliente.nextLine();
        System.out.println("Digite seu endereço");
        cliente.enderenco = dadosCliente.nextLine();
        System.out.println("Digite a sua conta:");
        cliente.contaAssociada = dadosCliente.nextInt();
        System.out.println("digite a sua senha:");
        cliente.senha = dadosCliente.nextInt();
        System.out.println("Você é pessoa física ou jurídica:");
        cliente.pessoaFisicaOuJuridica = dadosCliente.nextLine();
        String teste = dadosCliente.nextLine();

        return cliente;
    }
}
