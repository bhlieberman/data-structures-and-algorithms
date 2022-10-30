package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

    @Test void testEmpty() {
      LinkedList ll = new LinkedList();
      assert(ll.head == null);
    }

    @Test void testInsert() {
      LinkedList ll = new LinkedList();
      Node n = new Node(30);
      ll.insert(n);
      assert(ll.head.getValue() == 30);
    }

    @Test void testHead() {
      Node n = new Node(3);
      LinkedList ll = new LinkedList(n);
      assert(ll.head.getValue() == 3);
    }

    @Test void testHeadAndNext() {
      Node n = new Node(3);
      Node nx = new Node(4);
      LinkedList ll = new LinkedList(n, nx);
      assert(ll.head.getValue() == 3);
      assert(ll.head.next.getValue() == 4);
    }

    @Test void testIncludes() {
      Node n = new Node(3);
      Node nx = new Node(4);
      LinkedList ll = new LinkedList(n, nx);
      ll.insert(new Node(2));
      assertTrue(ll.includes(nx));
    }

    @Test void testIncludesNot() {
      Node n = new Node(3);
      Node nx = new Node(4);
      LinkedList ll = new LinkedList(n, nx);
      ll.insert(new Node(2));
      assertFalse(ll.includes(new Node(16)));
    }

    @Test void testToStringImpl() {
      Node n = new Node(3);
      Node nx = new Node(4);
      LinkedList ll = new LinkedList(n, nx);
      ll.insert(new Node(2));
      assertEquals(ll.toString(), "{2}->{3}->{4}->NULL");
    }
}
