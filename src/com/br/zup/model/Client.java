package com.br.zup.model;


public class Client {

    protected String name;
    protected String cpf;
    protected String phoneNumber;
    protected String anddress;
    protected Account account;

    public Client() {
    }

    public Client(String name, String cpf, String phoneNumber, String anddress, Account account) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.anddress = anddress;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAnddress() {
        return anddress;
    }

    public void setAnddress(String anddress) {
        this.anddress = anddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}