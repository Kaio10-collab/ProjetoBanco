package com.br.zup;

public class Conta extends CadastroCliente {

    protected boolean sacaSaldoDaConta(double quantidade) {
        double novoSaldoDaConta = this.contaAssociada - quantidade;
        this.contaAssociada = novoSaldoDaConta;
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        this.contaAssociada += quantidade;
    }

    protected String extratoDaConta() {
        String dados = "Titular: " + this.nomeCompleto;
        dados += "\nDocumento Oficial: " + this.cpfOuRg;
        dados += "\nSaldo Atual: " + this.contaAssociada;
        return dados;
    }

    boolean transfere(Conta destino, double valor) throws Exception{
        boolean retirou = this.sacaSaldoDaConta(valor);
        if (retirou == false){
            throw new Exception("Saldo insuficiente");
        }
        else {
            destino.depositaSaldoNaConta(valor);
            return true;
        }
    }
}