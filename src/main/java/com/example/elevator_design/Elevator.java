package com.example.elevator_design;

import com.example.elevator_design.Enum.Direction;
import com.example.elevator_design.Enum.DoorStatus;

import java.util.SortedSet;

public class Elevator {

    public SortedSet<Integer> requestedStops;

//    public int capacity;

//    public Button button;

    public int currentFloor;

    public Direction direction = Direction.STOPPED;
    public DoorStatus doorStatus = DoorStatus.CLOSE;
    //public ElevatorStatus elevatorStatus = ElevatorStatus.STOPPED;

    public void moveUp() {
        this.currentFloor++;
    }

    public void moveDown() {
        this.currentFloor--;
    }

    public void openDoors() {
        doorStatus = DoorStatus.OPEN;
    }

    public void closeDoors() {
        doorStatus = DoorStatus.CLOSE;
    }

    public boolean reachedFinalDestination() {

        if (requestedStops.size() == 0) {
            // check RequestHandler
        }

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
        return false;
    }
}
