package datastructures.trees;

public class Node {
  Object val;
  Node leftChild;
  Node rightChild;

  public Node(Object val) {
    this.val = val;
  }

  public Node(Object val, Node left, Node right) {
    this.val = val;
    this.leftChild = left;
    this.rightChild = right;
  }

  public Object getValue() {
    return this.val;
  }

  public void setValue(Object val) { this.val = val; }

}
