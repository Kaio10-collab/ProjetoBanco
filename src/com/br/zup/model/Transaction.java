package com.br.zup.model;

import java.time.LocalDate;

public class Transaction {

    protected Double amountTransaction;
    protected Client originClient;
    protected Client destinyClient;
    protected LocalDate dateTransaction;
    protected LocalDate typeTransaction;

    public Transaction() {
    }

    public Transaction(Double amountTransaction, Client originClient, Client destinyClient, LocalDate dateTransaction, LocalDate typeTransaction) {
        this.amountTransaction = amountTransaction;
        this.originClient = originClient;
        this.destinyClient = destinyClient;
        this.dateTransaction = dateTransaction;
        this.typeTransaction = typeTransaction;
    }

    public Double getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(Double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public Client getOriginClient() {
        return originClient;
    }

    public void setOriginClient(Client originClient) {
        this.originClient = originClient;
    }

    public Client getDestinyClient() {
        return destinyClient;
    }

    public void setDestinyClient(Client destinyClient) {
        this.destinyClient = destinyClient;
    }

    public LocalDate getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(LocalDate dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public LocalDate getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(LocalDate typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
}