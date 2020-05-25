package com.example.elevator_design;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RequestHandlerImpl implements RequestHandler {

    public Set<Request> requests;
    public RequestAlgorithm requestAlgorithm;

    public RequestHandlerImpl() {

        requests = new HashSet<Request>();
        requestAlgorithm = new RequestAlgorithm();
    }

    public void addRequest(Request request) {
//        if (FloorButton.class.isInstance(object)) {
//            System.out.println("Floor request");
//        }
//
//        if (ElevatorButton.class.isInstance(object)) {
//            System.out.println("Elevator request");
//        }
        requests.add(request);
    }

    public void removeRequest(Request request) {
        requests.remove(request);
    }

    public void assignElevator() {
        requestAlgorithm.algorithm1();
    }
}
