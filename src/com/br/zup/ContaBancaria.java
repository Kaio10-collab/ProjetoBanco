package com.br.zup;

import java.util.Scanner;

public class ContaBancaria  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conta conta = new Conta();
        CadastroCliente cliente = new CadastroCliente();
        int opcao;

        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1.Cadastrar Cliente: ");
            System.out.println("2.Saque");
            System.out.println("3.Deposito");
            System.out.println("4.Transferência");
            System.out.println("5.Extrato");
            System.out.println("6.Saída");
            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println(cliente.cadastrarCliente());
            }else if (opcao == 2){
                System.out.println(conta.sacaSaldoDaConta(conta.saldo));
            }else if (opcao == 3){
                System.out.println(conta.depositaSaldoNaConta(conta.saldo));
            }else if (opcao == 4){
                System.out.println(conta.transfere(conta.depositaSaldoNaConta(scan.nextDouble()), 0));
            } else if (opcao == 5) {
                System.out.println(conta.extratoDaConta(conta.saldo));
            }
        } while (opcao!=6);
    }
}