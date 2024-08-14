package com.example.banking_app.Classes;

import java.util.LinkedList;

public class ClientList {
    private LinkedList<Client> clients;

    public ClientList() {
        clients = new LinkedList<>();
    }

    public void addClient(Client client)
    {
        clients.add(client);
    }

    public void removeClient(int accountNumber)
    {
        clients.removeIf(client -> client.getAccountNumber() == accountNumber);
    }

    public void showALLClients()
    {
        for (Client client : clients)
        {
            System.out.println(client);
        }
    }

}
