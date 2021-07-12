package com.br.zup;

import java.util.ArrayList;

public class Conta extends CadastroCliente {

    ArrayList<CadastroCliente> listaCliente = new ArrayList();

    protected boolean sacaSaldoDaConta(int quantidade) {
        int novoSaldoDaConta = this.contaAssociada - quantidade;
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

    boolean transfere(Conta destino, int valor) throws Exception{
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