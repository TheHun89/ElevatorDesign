package com.example.elevator_design;

import com.example.elevator_design.Enum.Direction;
import com.example.elevator_design.Enum.DoorStatus;

import java.util.SortedSet;

public class Elevator {

    public SortedSet<Integer> requestedStops;

    //public Button button;

    public int capacity;
    public int currentFloor;
    public Direction direction = Direction.STOPPED;
    public DoorStatus doorStatus = DoorStatus.CLOSE;

    public void moveUp() { this.currentFloor++; }

    public void moveDown() { this.currentFloor--; }

    public void openDoors() { doorStatus = DoorStatus.OPEN; }

    public void closeDoors() { doorStatus = DoorStatus.CLOSE; }

    public void startElevator() {

        // if direction == UP

        // if currentFloor.floorNumber >= requestHandler.requests highest number going up
        // then grab all the requests going down and change direction to DOWN
        // return true;

        // else
        // get all requestHandler.requests that are greater
        // return false;

        // if direction == DOWN

        // if currentFloor.floorNumber <= requestHandler.requests highest number going up
        // then grab all the requests going down and change direction to DOWN
        // else
        // get all requestHandler.requests that are greater
    }

    public void stopElevator() {}

}
