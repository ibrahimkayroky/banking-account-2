package com.example.banking_app.Classes;

import java.util.LinkedList;

public class Client {
    private String name;
    private int accountNumber;
    private  double balance;
    private LinkedList<Transaction> transactions;

    public Client(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new LinkedList<>();
    }

    public void deposit(double amount)
    {
        balance += amount;
        addTranaction("Deposit", amount);
    }

    public void addTranaction(String type, double amount) {
        Transaction transaction = new Transaction(type ,amount);
        transactions.add(transaction);
    }

    public void showTranactions()
    {
        for (Transaction transaction : transactions)
        {
            System.out.println(transaction);
        }
    }

}
