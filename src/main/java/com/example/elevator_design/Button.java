package com.example.elevator_design;

public abstract class Button {

    abstract void makeRequest(IRequestHandler requestHandler, Request request);
}
