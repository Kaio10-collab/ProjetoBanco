package com.br.zup;

public class Conta extends CadastroCliente {

    protected double saldo;

    public Conta() {
    }

    protected boolean sacaSaldoDaConta(int quantidade) {
        double novoSaldoDaConta = this.saldo - quantidade;
        this.saldo = novoSaldoDaConta;
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        this.saldo += quantidade;
    }

    protected String extratoDaConta() {
        String dados = "Titular: " + this.nomeCompleto.equalsIgnoreCase(getNomeCompleto());
        dados += "\nDocumento Oficial: " + this.cpfOuRg.equals(getCpfOuRg());
        dados += "\nSaldo Atual: " + this.saldo;
        return dados;
    }

    boolean transfere(Conta destino, int valor) {
        boolean retirou = this.sacaSaldoDaConta(valor);
        if (retirou == false){
            return false;
        }
        else {
            destino.depositaSaldoNaConta(valor);
            return true;
        }
    }
}