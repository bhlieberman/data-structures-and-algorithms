package datastructures.stack_and_queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  @Test
  void testStackPush() {
    Stack n = new Stack();
    n.push(3);
    assertEquals(3, n.top.getValue());
  }

  @Test
  void testStackPushTwo() {
    Stack n = new Stack();
    n.push(3);
    n.push(4);
    assertEquals(4, n.top.getValue());
  }

  @Test
  void testStackPop() {
    Stack n = new Stack();
    n.push(3);
    assertNotNull(n.top);
    assertEquals(3, n.pop().getValue());
  }

  @Test void testStackPopThrows() {
    Stack n = new Stack();
    assertThrows(NullPointerException.class, n::pop);
  }

  @Test void testStackPeepThrows() {
    Stack n = new Stack();
    assertThrows(NullPointerException.class, n::peek);
  }

  @Test void testStackPeep() {
    Stack n = new Stack();
    n.push(3);
    assertEquals(3, n.peek());
  }

  @Test void testIsEmpty() {
    Stack n = new Stack();
    assertTrue(n.isEmpty());
    n.push(14);
    assertFalse(n.isEmpty());
  }
}
