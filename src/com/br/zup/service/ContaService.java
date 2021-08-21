package com.br.zup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaService {

    protected double saldo;
    private List<String> operacoes = new ArrayList();
    Random random = new Random(340983405);
    protected int numeroConta = random.nextInt();

    Scanner valorSaque = new Scanner(System.in);

    protected double sacaSaldoDaConta(double quantidade) {
        System.out.println("Digite o valor do saque: ");
        System.out.println(valorSaque.nextDouble());
        if ((saldo-quantidade) >=0) {
            saldo -= quantidade;
            operacoes.add("Saque no valor de R$: " + quantidade);
        }
        else {
            System.out.println("Saldo insuficiente para saque.");
        }
        return quantidade;
    }

    protected boolean depositaSaldoNaConta(double quantidade) {
        saldo += quantidade;
        operacoes.add("Deposito no valor de R$: " + quantidade);
        return false;
    }

    protected void extratoDaConta(double quantidade) {
        for (String extrato : operacoes) {
            System.out.println(extrato);
        }
    }

    protected void transfere(ContaService destino, double valor) {
        double retirou = sacaSaldoDaConta(valor);
        if (retirou == sacaSaldoDaConta(valor)){

        }
        else {
            destino.depositaSaldoNaConta(valor);
            operacoes.add("Transferência no valor de R$: " + valor + "para a conta " + numeroConta);
        }
    }
}