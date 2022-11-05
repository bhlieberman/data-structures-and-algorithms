package datastructures.stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
  @Test
  void testEnqueue() {
    Queue q = new Queue();
    q.enqueue(42);
    assertEquals(42, q.front.getValue());
  }

  @Test
  void testDequeue() {
    Queue q = new Queue();
    assertThrows(NullPointerException.class, q::dequeue);
    q.enqueue(42);
    assertEquals(42, q.dequeue());
  }

  @Test
  void testPeek() {
    Queue q = new Queue();
    assertThrows(NullPointerException.class, q::peek);
    q.enqueue(42);
    assertEquals(42, q.peek());
  }

  @Test
  void testIsEmpty() {
    Queue q = new Queue();
    assertTrue(q.isEmpty());
    q.enqueue(42);
    assertFalse(q.isEmpty());
  }
}
