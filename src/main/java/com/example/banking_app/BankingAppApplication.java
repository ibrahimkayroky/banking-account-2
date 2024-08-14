package com.example.banking_app;

import com.example.banking_app.Classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BankingAppApplication.class, args);
		ClientList clientList = new ClientList();
		Admin admin = new Admin(clientList);

		Client client1 = new Client("Mohamed Hesham" , 1,12500);
		Client client2 = new Client("Amar Hesham" , 2,14500);
		Client client3 = new Client("Ibrahim Esam" , 3,1500);
		Client client4 = new Client("Ali Elsayed" , 4,18000);

		admin.addClient(client1);
		admin.addClient(client2);
		admin.addClient(client3);
		admin.addClient(client4);

		client1.deposit(1500);
		client1.withdraw(300);
		client3.deposit(3650);

		TransactionStack transactionStack = new TransactionStack();
		transactionStack.pushTransaction(new Transaction("Deposit",3500));
		transactionStack.popTransaction();

		RequestQueue requestQueue = new RequestQueue();
		requestQueue.addRequest("Ibrahim requests 1950$");
		requestQueue.showRequests();

		admin.showAllClients();



	}

}
