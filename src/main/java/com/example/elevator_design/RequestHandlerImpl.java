package com.example.elevator_design;

import java.util.HashSet;
import java.util.Set;

public class RequestHandlerImpl implements IRequestHandler {

    public Set<Request> requests;
    public RequestAlgorithm requestAlgorithm;

    public RequestHandlerImpl() {

        requests = new HashSet<Request>();
        requestAlgorithm = new RequestAlgorithm();
    }

    public void addRequest(Request request) {
        requests.add(request);
    }

    public void removeRequest(Request request) {
        requests.remove(request);
    }

    public void assignElevator() {
        requestAlgorithm.algorithm1();
    }
}
