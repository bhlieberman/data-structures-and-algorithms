package datastructures.linkedlist;

public class Node {
  private final int value;
  public Node next;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
