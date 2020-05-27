package com.example.elevator_design;

import com.example.elevator_design.Enum.Direction;

public class Request {

    public int floor;
    public Direction direction;

    public Request() {}

    public Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;

        return floor == request.floor &&
                direction.equals(request.direction);
    }

    public int hashCode() {
        return floor;
    }
}
