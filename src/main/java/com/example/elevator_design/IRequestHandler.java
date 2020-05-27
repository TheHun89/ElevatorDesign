package com.example.elevator_design;

public interface IRequestHandler {

    void addRequest(Request request);
    void removeRequest(Request request);
    void assignElevator();

}
