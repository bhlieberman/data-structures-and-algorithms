# `AnimalShelter Queue`

This is a queue implementation that models an animal shelter. A user submits a "preference" for either a dog or cat.

The queue accepts new dogs or cats and when one is requested, it is removed from the front of the queue.

# Whiteboard

[Whiteboard](datastructures/animalQueue.png)

# Approach and Efficiency

I used the pre-existing `Queue` class and its corresponding `dequeue` and `enqueue` methods. I created an `enum Animal` that restricted the inputs to either `DOG` or `CAT`. The `enqueue` method simply calls the `Queue.enqueue` method. The `dequeue` method looks if the provided argument matches the animal at the front of the queue and if so returns it. Else, it finds the animal by dequeuing until it does.

# Big O

If desired animal is at front, time complexity is O(1). Otherwise it's O(n). Space complexity is O(n) in all cases.

# To run it

Run this code with `./gradlew test`.
