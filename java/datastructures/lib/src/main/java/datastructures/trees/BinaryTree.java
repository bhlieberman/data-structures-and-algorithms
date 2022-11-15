package datastructures.trees;

import java.util.List;

public class BinaryTree {
  Node root;

  public BinaryTree(int val) {
    this.root = new Node(val, new Node(val-1), new Node(val+1));
  }

  public BinaryTree(int val, int valLeft, int valRight) {
    this.root = new Node(val, new Node(valLeft), new Node(valRight));
  }

  public List<Integer> preOrder(Node n, List<Integer> o) {
    o.add(n.getValue());
    if (n.leftChild != null) preOrder(n.leftChild, o);
    if (n.rightChild != null) preOrder(n.rightChild, o);
    return o;
  }

  public List<Integer> postOrder(Node n, List<Integer> o) {
    if (n.leftChild != null) postOrder(n.leftChild, o);
    if (n.rightChild != null) postOrder(n.rightChild, o);
    o.add(n.getValue());
    return o;
  }

  public List<Integer> inOrder(Node n, List<Integer> o) {
    if (n.leftChild != null) inOrder(n.leftChild, o);
    o.add(n.getValue());
    if (n.rightChild != null) inOrder(n.rightChild, o);
    return o;
  }

  public int inOrderMax(Node n, List<Integer> o) {
    if (n.leftChild != null) inOrder(n.leftChild, o);
    if (o.get(0) < n.getValue()){
      o.add(n.getValue());
    }
    if (n.rightChild != null) inOrder(n.rightChild, o);
    return o.get(o.size() - 1);
  }

}
