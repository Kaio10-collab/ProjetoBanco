package com.br.zup;

public class Conta extends CadastroCliente {

    protected double saldo;

    protected boolean sacaSaldoDaConta(double quantidade) {
        if ((saldo-quantidade) >=0) {
            saldo -= quantidade;
            return true;
        }
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        saldo += quantidade;
    }

    protected String extratoDaConta() {
        String dados = "Titular: " + nomeCompleto;
        dados += "\nDocumento Oficial: " + cpfOuRg;
        dados += "\nSaldo Atual: " + saldo;
        return dados;
    }

    protected boolean transfere(Conta destino, double valor) {
        boolean retirou = sacaSaldoDaConta(valor);
        if (retirou == false){
            return false;
        }
        else {
            destino.depositaSaldoNaConta(valor);
            return true;
        }
    }
}