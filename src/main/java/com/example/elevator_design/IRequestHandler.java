package com.example.elevator_design;

public interface RequestHandler {

    void addRequest(Request request);
    void removeRequest(Request request);
    void assignElevator();

}
