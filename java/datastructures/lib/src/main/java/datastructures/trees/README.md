# README

## Trees
This is an implementation of the `BinaryTree` datastructure and its sorted variant, `BinarySearchTree`. A `BinaryTree` has a root node, which tracks a left and right child node respectively. Each node can have a maximum of two children. The `BinarySearchTree` also adheres to these constraints but additionally the tree is sorted by the values of the nodes.

## Challenge
This challenge consisted of implementing these two related data structures. The `BinaryTree` must be implemented first as it is the superclass of `BinarySearchTree`.

## Approach & Efficiency
I used a recursive approach for the BT methods. This requires O(n) extra space to store the values of each node, and O(n) time.

## API
`preOrder(Node n, List<Integer> o)` - this method performs a pre-order traversal of the BT
`postOrder(Node n, List<Integer> o)` - this method performs a post-order traversal
`inOrder(Node n, List<Integer> o)` - this method does in-order
