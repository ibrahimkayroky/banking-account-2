package com.example.banking_app.Classes;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;
    private double amount;
    private LocalDateTime date;

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", date=" + date.toString() +
                '}';
    }
}
