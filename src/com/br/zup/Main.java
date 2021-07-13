package com.br.zup;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Conta cliente = new Conta();
        CadastroCliente cadastroCliente = new CadastroCliente();
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario("Kaio Sanches", "Rua Fulano de Tal", "77800172813", "Caixa",
                2345, 2876-4);

        System.out.println("Bem vindo ao Banco: " + cadastroFuncionario.nomeCompleto + " " + cadastroFuncionario.cargoNaEmpresa + " " + cadastroFuncionario.cpfOuRg);

        while (true) {
            IO.mostrarTexto("Selecione a opção desejada: \n1 Cadastro Cliente \n2 Sacar dinheiro \n3 Depositar dinheiro \n4 Transferência dinheiro \n5 Extrato \n6 sair ");

            String resposta = IO.retornoDados().nextLine();

            if (resposta.equalsIgnoreCase("1")) {
                System.out.println("Digite seu nome completo: " + cadastroCliente.getNomeCompleto());
                System.out.println("Enderenço: " + cadastroCliente.getEnderenco());
                System.out.println("Digite o CPF ou RG: " + cadastroCliente.getCpfOuRg());
                System.out.println("Qual a sua conta: " + cadastroCliente.getContaAssociada());
                System.out.println("Digite a sua senha: " + cadastroCliente.getSenha());
            } else if (resposta.equalsIgnoreCase("2")) {
                cliente.sacaSaldoDaConta(entrada.nextInt());
            } else if (resposta.equalsIgnoreCase("3")) {
                cliente.depositaSaldoNaConta(entrada.nextInt());
            } else if (resposta.equalsIgnoreCase("4")) {
                cliente.transfere(cliente, entrada.nextInt());
            } else if (resposta.equalsIgnoreCase("5")) {
                cliente.extratoDaConta();
            } else if (resposta.equalsIgnoreCase("6")){
                return;
            }
        }
    }
}