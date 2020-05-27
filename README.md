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

What are the use cases?

What are the classes?


### Resources
---
[GitHub - Elevator Example](https://github.com/mission-peace/Design/tree/master/Elevator/src/com/elevator/base)

[Elevator OO Design](https://massivetechinterview.blogspot.com/2015/07/thought-works-object-oriented-design.html)

https://medium.com/system-designing-interviews/design-a-elevator-system-fc5832ca0b8b
https://leetcode.com/discuss/interview-question/124660/design-an-Elevator
