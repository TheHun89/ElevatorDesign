package com.example.elevator_design;

import com.example.elevator_design.Enum.Direction;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        SortedSet<Integer> requests = new TreeSet<>();

        requests.add(2);
        //requests.add(1);
        requests.add(9);
        requests.add(4);
        requests.add(19);
        requests.add(9);
        requests.add(11);
        requests.add(8);

        //Iterator<Integer> iterator = requests.iterator();
        Iterator<Integer> subset = requests.tailSet(5).iterator();

        while (subset.hasNext()) {

            System.out.println(subset.next());
        }

        RequestHandlerImpl requestHandlerImpl = new RequestHandlerImpl();
        requestHandlerImpl.addRequest(new Request(2, Direction.STOPPED));
        requestHandlerImpl.addRequest(new Request(1, Direction.UP));
        requestHandlerImpl.addRequest(new Request(1, Direction.DOWN));
        requestHandlerImpl.addRequest(new Request(1, Direction.DOWN));
        requestHandlerImpl.addRequest(new Request(2, Direction.STOPPED));

        for (Request request: requestHandlerImpl.requests) {
            System.out.println(request.getFloor() + "   " + request.direction);
        }

        //requestHandlerImpl.addRequest(1);

//        Iterator<Integer> iterator = requestHandlerImpl.collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("it is " + iterator.next());
//        }
    }
}
