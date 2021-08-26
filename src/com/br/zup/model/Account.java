package com.br.zup.model;
/**
 * Definindo uma classe chamada Conta, criando get/set e constructor.
 */
public class Account {

    protected String numberAccount;
    protected Double balance;

    public Account() {
    }

    public Account(String numberAccount, Double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}