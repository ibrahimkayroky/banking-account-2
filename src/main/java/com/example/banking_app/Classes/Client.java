package com.example.banking_app.Classes;

import java.util.LinkedList;

public class Client {
    private String name;
    private int accountNumber;
    private  double balance;
    private LinkedList<Transaction> transactions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LinkedList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(LinkedList<Transaction> transactions) {
        this.transactions = transactions;
    }

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
