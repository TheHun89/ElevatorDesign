## Elevator Design
---

![Image](https://1.bp.blogspot.com/-z7GMS9_lG0E/UJ545jL2flI/AAAAAAAADFE/0eU-5yvhKQw/s1600/elevator-class+diagram.png)


### Tips
---
Start with bare minimum MVP requirements to just get a working solution

1. Gather requirements
2. Think about best data structure that can be used?  Queue
3. How important are Latency, Consistency and Availability for your system?
4. How is concurrency handled in your system?
5. How many classes will be there and what will be their methods

Remember the SOLID principles
Split functionalities amongst multiple classes

Be able to UML, Sequence and Component diagrams


### Description
---
### Ask questions
---
What components are involved?
What are the use cases?

User
* makes request

Elevator
* button for floor
* direction - UP, DOWN, STOPPED
* destination
* doors - open, close
* capacity
* pick up passengers
* list of floors to stop
* maxFloors

Floor
* button for direction

Something to handle requests






### Resources
---
[GitHub - Elevator Example](https://github.com/mission-peace/Design/tree/master/Elevator/src/com/elevator/base)

[Elevator OO Design](https://massivetechinterview.blogspot.com/2015/07/thought-works-object-oriented-design.html)
