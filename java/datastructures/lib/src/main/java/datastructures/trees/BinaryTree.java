package datastructures.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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
    if (n.leftChild != null) inOrderMax(n.leftChild, o);
    if (o.get(0) < n.getValue()){
      o.remove(0);
      o.add(n.getValue());
    }
    if (n.rightChild != null) inOrderMax(n.rightChild, o);
    return o.get(o.size() - 1);
  }

  public static List<Integer> breadthFirstSearch(BinaryTree bt) {
    Queue<Node> q = new ArrayDeque<>();
    List<Integer> al = new ArrayList<>();
    q.add(bt.root);
    while (!q.isEmpty()) {
      Node v = q.poll();
      al.add(v.getValue());
      if (v.leftChild != null) q.add(v.leftChild);
      if (v.rightChild != null) q.add(v.rightChild);
    }
    return al;
  }

}
