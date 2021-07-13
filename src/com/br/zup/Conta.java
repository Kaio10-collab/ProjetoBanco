package com.br.zup;

public class Conta extends CadastroCliente {

    protected boolean sacaSaldoDaConta(int quantidade) {
        int novoSaldoDaConta = this.contaAssociada - quantidade;
        this.contaAssociada = novoSaldoDaConta;
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        this.contaAssociada += quantidade;
    }

    protected String extratoDaConta() {
        String dados = "Titular: " + this.getNomeCompleto();
        dados += "\nDocumento Oficial: " + this.getCpfOuRg();
        dados += "\nSaldo Atual: " + this.getContaAssociada();
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