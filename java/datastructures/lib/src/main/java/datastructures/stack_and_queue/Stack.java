package datastructures.stack_and_queue;

import datastructures.linkedlist.Node;

public class Stack {
  Node top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    if (this.top != null) {
      Node n = new Node(value);
      Node temp = this.top;
      this.top = n;
      this.top.next = temp;
    } else {
      this.top = new Node(value);
    }
  }

  public Node pop() throws NullPointerException {
    Node temp;
    if (this.top != null) {
      temp = this.top;
      this.top = this.top.next;
    } else throw new NullPointerException();
    return temp;
  }

  public int peek() throws NullPointerException {
    if (this.top != null) return this.top.getValue();
    else throw new NullPointerException();
  }

  public boolean isEmpty() {
    return this.top == null;
  }
}
