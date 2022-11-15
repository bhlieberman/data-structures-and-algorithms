package datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {
  Node root;
  public BinarySearchTree(int val, int valLeft, int valRight) {
    super(val, valLeft, valRight);
    this.root = new Node(val, new Node(valLeft), new Node(valRight));
  }

  public void add(int n) {
    Node nd = new Node(n);
    if (this.root != null && n > this.root.getValue()) this.root.rightChild.rightChild = nd;
    else if (this.root != null && n <= this.root.getValue()) this.root.leftChild.leftChild = nd;
  }

  public boolean contains(Node n) {
    List<Integer> o = new ArrayList<>();
    this.inOrder(this.root, o);
    if (o.contains(n.getValue())) return true;
    else return false;
  }
}
