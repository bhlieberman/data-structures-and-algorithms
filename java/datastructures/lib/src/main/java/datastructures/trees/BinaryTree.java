package datastructures.trees;

import java.util.*;

public class BinaryTree<T> {
  public Node root;

  public BinaryTree(int val) {
    this.root = new Node(val, new Node(val-1), new Node(val+1));
  }

  public BinaryTree(T val, T valLeft, T valRight) {
    this.root = new Node(val, new Node(valLeft), new Node(valRight));
  }

  public List<Integer> preOrder(Node n, List<Integer> o) {
    o.add((int) n.getValue());
    if (n.leftChild != null) preOrder(n.leftChild, o);
    if (n.rightChild != null) preOrder(n.rightChild, o);
    return o;
  }

  public List<Integer> postOrder(Node n, List<Integer> o) {
    if (n.leftChild != null) postOrder(n.leftChild, o);
    if (n.rightChild != null) postOrder(n.rightChild, o);
    o.add((int) n.getValue());
    return o;
  }

  public List<Integer> inOrder(Node n, List<Integer> o) {
    if (n.leftChild != null) inOrder(n.leftChild, o);
    o.add((int) n.getValue());
    if (n.rightChild != null) inOrder(n.rightChild, o);
    return o;
  }

  public int inOrderMax(Node n, List<Integer> o) {
    if (n.leftChild != null) inOrderMax(n.leftChild, o);
    if (o.get(0) < (int) n.getValue()){
      o.remove(0);
      o.add((int) n.getValue());
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
      al.add((int) v.getValue());
      if (v.leftChild != null) q.add(v.leftChild);
      if (v.rightChild != null) q.add(v.rightChild);
    }
    return al;
  }

  public static HashMap<Integer, Integer> treeIntersectionFind(HashMap<Integer, Integer> storage, BinaryTree bt) {
    Queue<Node> q = new ArrayDeque<>();
    q.add(bt.root);
    storage.put((int) bt.root.getValue(), 0);
    while (!q.isEmpty()) {
      Node v = q.poll();
      storage.merge((int) v.getValue(), 1, Integer::sum);
      if (v.leftChild != null) q.add(v.leftChild);
      if (v.rightChild != null) q.add(v.rightChild);
    }
    return storage;
  }

  public static BinaryTree kAryTree(BinaryTree bt, Node n) {
    if (n != null && !n.getValue().getClass().equals(String.class)) {
      if ((int) n.getValue() % 3 == 0 && (int) n.getValue() % 5 == 0)
        n.val = "fizzbuzz";
      else if ((int) n.getValue() % 3 == 0)
        n.val = "fizz";
      else if ((int) n.getValue() % 5 == 0)
        n.val = "buzz";
      if (bt.root.leftChild != null) kAryTree(bt, bt.root.leftChild);
      if (bt.root.rightChild != null) kAryTree(bt, bt.root.rightChild);
    }
    return bt;
  }

}
