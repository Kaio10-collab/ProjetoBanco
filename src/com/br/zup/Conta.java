package com.br.zup;

public class Conta extends CadastroCliente {

    protected double saldo;

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

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
        String dados = "Titular: " + this.nomeCompleto.equalsIgnoreCase(getNomeCompleto());
        dados += "\nDocumento Oficial: " + this.cpfOuRg.equals(getCpfOuRg());
        dados += "\nSaldo Atual: " + this.saldo;
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