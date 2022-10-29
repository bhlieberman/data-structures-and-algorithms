package datastructures.linkedlist;

public class LinkedList
{
  public Node head;

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

  public Boolean includes(Node value) {
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
