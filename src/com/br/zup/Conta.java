package com.br.zup;

public class Conta extends CadastroFuncionario {

    protected boolean sacaSaldoDaConta(double quantidade) {
        double novoSaldoDaConta = this.contaAssociada - quantidade;
        this.contaAssociada = novoSaldoDaConta;
        return false;
    }

    protected void depositaSaldoNaConta(double quantidade) {
        this.contaAssociada += quantidade;
    }

    public boolean extratoDaConta() {

        CadastroCliente contaCliente = new CadastroCliente();
        contaCliente.setNomeCompleto(getNomeCompleto());
        contaCliente.setContaAssociada(getContaAssociada());
        contaCliente.setCpfOuRg(getCpfOuRg());

        CadastroFuncionario contaFuncionario = new CadastroFuncionario();
        contaFuncionario.setCargoNaEmpresa(getCargoNaEmpresa());
        contaFuncionario.setCpfOuRg(getCpfOuRg());
        return false;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.sacaSaldoDaConta(valor);
        if (retirou == false){
            // não deu pra sacar!
            return false;
        }
        else {
            destino.depositaSaldoNaConta(valor);
            return true;
        }
    }
}