package com.example.banking_app.Classes;

public class Admin {
    private ClientList clientList;

    public Admin(ClientList clientList) {
        this.clientList = clientList;
    }

    public void addClient(Client client) {
        clientList.addClient(client);
    }

    public void removeClient(int accountNumber) {
        clientList.removeClient(accountNumber);
    }

    public void showAllClients() {
        clientList.showALLClients();
    }

}
