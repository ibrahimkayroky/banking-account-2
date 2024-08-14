package com.example.banking_app.Classes;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private Queue<String> requestQueue;

    public RequestQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(String request) {
        requestQueue.add(request);
    }

    public void processNextRequest() {
        if (!requestQueue.isEmpty()) {
            String request = requestQueue.poll(); //remove head
            System.out.println("Processing " + request);
        }
        else {
            System.out.println("No requests in the queue.");
        }
    }

    public void showRequests() {
        for (String request : requestQueue) {
            System.out.println(request);
        }
    }
}
