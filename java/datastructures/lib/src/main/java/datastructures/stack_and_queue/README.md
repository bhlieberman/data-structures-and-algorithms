# PseudoQueue implementation

This queue is implemented using two stacks. The basic algorithm consists of pushing as many elements as desired onto the first stack. When the elements are to be dequeued, the second stack is checked for existing elements. If there are, those elements are popped. If not, then the elements are iteratively popped off the first stack, and pushed onto the second. When stack one is empty, the top element of stack two is popped and returned.

See this visualization:

![Visualization]("https://github.com/bhlieberman/data-structures-and-algorithms/blob/main/java/datastructures/pseudoqueueViz.png")
