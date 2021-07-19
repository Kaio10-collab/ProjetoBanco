package com.br.zup;

import java.util.Scanner;

public class ContaBancaria  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        Cliente cliente = new Cliente();

        System.out.println("Selecione a opção desejada: ");


        int opcao;

        do {
            System.out.println("1.Cadastrar Cliente");
            System.out.println("2.Saque");
            System.out.println("3.Deposito");
            System.out.println("4.Transferência");
            System.out.println("5.Extrato");
            System.out.println("6.Saída");
            opcao = scan.nextInt();
        } while (opcao!=6);

    }
}