package com.example.banking_app.Classes;

import java.util.Stack;

public class TransactionStack {
    private Stack<Transaction> transactionStack;

    public TransactionStack()
    {
        transactionStack = new Stack<>();
    }

    public void pushTransaction(Transaction transaction)
    {
        transactionStack.push(transaction);
    }

    public void popTransaction()
    {
        if(!transactionStack.isEmpty())
        {
            Transaction lastTransaction = transactionStack.pop();
            System.out.println(lastTransaction);
        }

        else {
            System.out.println("not found");
        }
    }

}
