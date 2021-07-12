package com.br.zup;

public class Main{

    public static void main(String[] args) {

        Conta cliente = new Conta();
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario("Kaio Sanches", "Rua Fulano de Tal", "77800172813", "Caixa",
                2345, 2876-4);

        System.out.println("Bem vindo ao Banco: ");

        while (true) {
           IO.mostrarTexto("Selecione a opção desejada: \n1 Cadastro Cliente \n2 Sacar dinheiro \n3 Depositar dinheiro \n4 Transferência dinheiro \n5 Extrato \n6 sair ");

           String resposta = IO.retornoDados().nextLine();

        }
    }
}