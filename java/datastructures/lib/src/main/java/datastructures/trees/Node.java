package datastructures.trees;

public class Node {
  int val;
  Node leftChild;
  Node rightChild;

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, Node left, Node right) {
    this.val = val;
    this.leftChild = left;
    this.rightChild = right;
  }

  public int getValue() {
    return this.val;
  }

}
