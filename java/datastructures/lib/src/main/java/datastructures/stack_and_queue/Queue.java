package datastructures.stack_and_queue;

import datastructures.linkedlist.Node;

public class Queue {
  Node front;

  public Queue() {
    this.front = null;
  }

  public void enqueue(int value) {
    if (this.front == null) this.front = new Node(value);
    else this.front.next = new Node(value);
  }

  public int dequeue() throws NullPointerException {
    if (this.front != null) {
      Node temp = this.front;
      this.front = null;
      return temp.getValue();
    } else throw new NullPointerException();
  }

  public int peek() throws NullPointerException {
    return this.front.getValue();
  }

  public boolean isEmpty() {
    return this.front == null;
  }
}
