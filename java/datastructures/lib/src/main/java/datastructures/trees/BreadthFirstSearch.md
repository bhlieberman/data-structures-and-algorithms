# Breadth-first search

This is an implementation of a breadth-first search of a binary tree. I use an instance `java.util.ArrayDeque` to track the progress through the tree.

## Approach and Efficiency

This approach to a breadth-first search uses an extra storage array. It requires O(n) space and O(n) time because every node in the tree must be visited.

## API

`breadthFirstSearch(BinaryTree bt)` - this method is static. It takes in an instance of `BinaryTree`. It returns an `ArrayList<Integer>`.

## Visualization

[Click here for visualization]()
