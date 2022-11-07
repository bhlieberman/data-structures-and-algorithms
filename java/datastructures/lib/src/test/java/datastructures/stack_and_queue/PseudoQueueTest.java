package datastructures.stack_and_queue;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {
  @Test
  void testPseudoEnqueue() {
    PseudoQueue pq = new PseudoQueue();
    pq.enqueue(1);
    assertEquals(1, pq.s1.peek());
  }

  @Test
  void testPseudoEnqueueMulti() {
    PseudoQueue pq = new PseudoQueue();
    IntStream.range(0, 10).forEach(pq::enqueue);
    assertEquals(9, pq.s1.peek());
  }

  @Test
  void testPseudoDequeue() {
    PseudoQueue pq = new PseudoQueue();
    IntStream.range(0, 10).forEach(pq::enqueue);
    assertEquals(0, pq.dequeue());
  }
}
