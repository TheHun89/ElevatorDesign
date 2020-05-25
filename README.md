## Elevator Design
---

![Image](https://1.bp.blogspot.com/-z7GMS9_lG0E/UJ545jL2flI/AAAAAAAADFE/0eU-5yvhKQw/s1600/elevator-class+diagram.png)


### Tips
---
Start with bare minimum MVP requirements to just get a working solution

1. Gather requirements
2. Think about best data structure that can be used?  
    * SortedSet of requests, not Queue.
    * You use a set because you want their to be only one unique request per floor
    * You want it to be sorted
3. How important are Latency, Consistency and Availability for your system?
4. How is concurrency handled in your system?
5. How many classes will be there and what will be their methods
6. What design patterns can be used?

Remember the SOLID principles
Split functionalities amongst multiple classes

Be able to UML, Sequence and Component diagrams


### Description
---
### Ask questions
---
Conceptually, how should the elevator behave?
One elevator then it should go all the way up then all the way down.  
So a data structure that maintains order would be a **queue** of just the requested direction.

But you wouldn't want the elevator to be going up and then pick up someone
who wants to go down.  So an alternative would be to use some form of HashMap.
You may also want to not have duplicate requests so you could use some form of a Set.
So a better data structure would be something that uses **key/value**.
Furthermore you
  * Some kind of a queue with key/value: floor/direction
  * elevator should have a collection of requests it plans to process
  * grab highest request and process all request from elevator current floor to highest request
  * when the requests are all completed then check outstanding requests and process
    all of the requests from current floor to lowest request

What components are involved?

User (Client)
* makes request

Button
* illuminates when clicked

Elevator
* button for floor
* direction - UP, DOWN, STOPPED
* destination
* doors - open, close
* capacity
* pick up passengers
* list of floors to stop
* maxFloors
* trigger emergency brake

Floor
* button for direction

What are the use cases?

What are the classes?
RequestHandler - Something to handle requests
Button <- FloorButton which requests up or down, ElevatorButton which requests floor
ElevatorController
Elevator
Enums - Direction, DoorStatus, ElevatorStatus


Enums - OPEN, CLOSED, UP, DOWN, STOPPED





### Resources
---
[GitHub - Elevator Example](https://github.com/mission-peace/Design/tree/master/Elevator/src/com/elevator/base)

[Elevator OO Design](https://massivetechinterview.blogspot.com/2015/07/thought-works-object-oriented-design.html)

https://medium.com/system-designing-interviews/design-a-elevator-system-fc5832ca0b8b
https://leetcode.com/discuss/interview-question/124660/design-an-Elevator
