package com.example.elevator_design;

public class FloorButton extends Button {

    public int floorNumber;

    public boolean requestSubmitted;  // this property will keep duplicate requests from being submitted

    public void makeRequest(RequestHandlerImpl requestHandlerImpl, Request request) {

        if (requestSubmitted) {
            // request already submitted
        } else {
            requestHandlerImpl.addRequest(request);
        }
    }
}
