package datastructures.stack_and_queue;

public class PseudoQueue {
  Stack s1;
  Stack s2;
  public PseudoQueue() {
    this.s1 = new Stack();
    this.s2 = new Stack();
  }

  public void enqueue(int val) {
    this.s1.push(val);
  }

  public int dequeue() {
    try {
      if (this.s2.isEmpty()) {
        while (!this.s1.isEmpty())
          this.s2.push(this.s1.pop().getValue());
      }
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }
    return this.s2.pop().getValue();
  }
}
