package datastructures.linkedlist;

public class LinkedList
{
  public Node head;
  public Node tail;

  public LinkedList() {
    this.head = null;
  }

  public LinkedList(Node head) {
    this.head = head;
  }

  public LinkedList(Node head, Node next) {
    this.head = head;
    this.head.next = next;
  }

  public void insert(Node value) {
    value.next = this.head;
    this.head = value;
  }

  public void insertBefore(int existingValue, int newValue) {
    Node current = this.head;
    while (current.getValue() != existingValue) current = current.next;
    Node n = new Node(newValue);
    n.next = current.next;
    current.next = n;
  }

  public void insertAfter(int existingValue, int newValue) {
    Node current = this.head;
    while (current.getValue() != existingValue) current = current.next;
    Node n = new Node(newValue);
    current.next = n;
  }

  public void append(int value) {
    Node n = new Node(value);
    if (this.head.next == null) this.head.next = n;
    else {
      Node current = this.head;
      while (current.next != null) current = current.next;
      current.next = n;
    }
  }

  public boolean includes(Node value) {
    Node current = this.head;
    while (current != null) {
      if (current == value) return true;
      else current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node current = this.head;
    while (current != null) {
      sb.append("{")
        .append(current.getValue())
        .append("}->");
      current = current.next;
    }
    sb.append("NULL");
    return sb.toString();
  }
}
