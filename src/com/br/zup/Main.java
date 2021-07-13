package com.br.zup;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        ArrayList<CadastroCliente> cadastroCliente = new ArrayList();
        ArrayList<Conta> contaAssociada = new ArrayList<>();
        int id = 1;

        Scanner entrada = new Scanner(System.in);
        CadastroCliente cliente;
        Conta conta;
        Conta conta1 = new Conta();
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario("Kaio Sanches", "Rua Fulano de Tal", "77800172813", "Caixa",
                2345, 2876-4);

        System.out.println("Bem vindo ao Banco: " + cadastroFuncionario.nomeCompleto + " " + cadastroFuncionario.cargoNaEmpresa + " " + cadastroFuncionario.cpfOuRg);

        while (true) {
            IO.mostrarTexto("Selecione a opção desejada: \n1 Cadastro Cliente \n2 Sacar dinheiro \n3 Depositar dinheiro \n4 Transferência dinheiro \n5 Extrato \n6 sair ");

            String resposta = IO.retornoDados().nextLine();

            if (resposta.equalsIgnoreCase("1")) {
                System.out.println("Digite seu nome completo: ");
                String nome = IO.retornoDados().nextLine();
                System.out.println("Enderenço: ");
                String endereco = IO.retornoDados().nextLine();
                System.out.println("Digite o CPF ou RG: ");
                String cpf = IO.retornoDados().nextLine();
                System.out.println("Sua conta é: " + id );
                System.out.println("Digite a sua senha: ");
                String senha = IO.retornoDados().nextLine();
                cliente = new CadastroCliente(nome, endereco, Integer.parseInt(cpf),Integer.parseInt(senha) ,id);
                conta = new Conta();
                cadastroCliente.add(cliente);
                contaAssociada.add(conta);
                id++;
            } else if (resposta.equalsIgnoreCase("2")) {
                System.out.println("Conta: ");
                String idd = IO.retornoDados().nextLine();
                System.out.println("Valor: ");
                String valor = IO.retornoDados().nextLine();
                contaAssociada.get(Integer.parseInt(idd)).sacaSaldoDaConta(Integer.parseInt(valor));
            } else if (resposta.equalsIgnoreCase("3")) {
                System.out.println("Conta: ");
                String idd = IO.retornoDados().nextLine();
                System.out.println("Valor: ");
                String valor = IO.retornoDados().nextLine();
                contaAssociada.get(Integer.parseInt(idd)).depositaSaldoNaConta(Integer.parseInt(valor));
            } else if (resposta.equalsIgnoreCase("4")) {
                System.out.println("Conta principal: ");
                String idd = IO.retornoDados().nextLine();
                System.out.println("Conta Destino: ");
                String idd2 = IO.retornoDados().nextLine();
                System.out.println("Valor: ");
                String valor = IO.retornoDados().nextLine();
                contaAssociada.get(Integer.parseInt(idd)).transfere(contaAssociada.get(Integer.parseInt(idd)), Integer.parseInt(valor));
            } else if (resposta.equalsIgnoreCase("5")) {
                System.out.println("Conta: ");
                String idd = IO.retornoDados().nextLine();
                System.out.println(contaAssociada.get(Integer.parseInt(idd)).extratoDaConta());
            } else if (resposta.equalsIgnoreCase("6")){
                return;
            }
        }
    }
}