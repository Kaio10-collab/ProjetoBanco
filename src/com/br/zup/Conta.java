package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Conta {

    protected double saldo;
    private List<String> operacoes = new ArrayList();
    Random random = new Random(340983405);
    protected int numeroConta = random.nextInt();

    protected boolean sacaSaldoDaConta(double quantidade) {
        if ((saldo-quantidade) >=0) {
            saldo -= quantidade;
            operacoes.add("Saque no valor de R$: " + quantidade);
            return true;
        }else {
            System.out.println("Saldo insuficiente para saque.");
        }
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        saldo += quantidade;
        operacoes.add("Deposito no valor de R$: " + quantidade);
    }

    protected void extratoDaConta() {
        for (String extrato : operacoes) {
            System.out.println(extrato);
        }
    }

    protected boolean transfere(Conta destino, double valor) {
        boolean retirou = sacaSaldoDaConta(valor);
        if (retirou == false){
            return false;
        }
        else {
            destino.depositaSaldoNaConta(valor);
            operacoes.add("Transferência no valor de R$: " + valor + "para a conta " + numeroConta);
            return true;
        }
    }
}