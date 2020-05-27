package com.example.elevator_design;

public class ElevatorButton extends Button {

    //    public RequestHandlerImpl requestHandlerImpl;

    public void makeRequest(RequestHandlerImpl requestHandlerImpl, Request request) {

        requestHandlerImpl.addRequest(request);
    }
}
