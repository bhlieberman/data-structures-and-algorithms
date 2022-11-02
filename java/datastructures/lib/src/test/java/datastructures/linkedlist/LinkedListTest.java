package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

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

    @Test void testAppend() {
      LinkedList ll = new LinkedList(new Node(42), new Node(65));
      ll.append(72);
      assert(ll.head.next.next.getValue() == 72);
    }

    @Test void testInsertBefore() {
      LinkedList ll = new LinkedList();
      ll.insert(new Node(3));
      ll.insert(new Node(15));
      ll.insertBefore(15, 7);
      assert(ll.head.next.getValue() == 7);
    }

    @Test void testInsertAfter() {
      LinkedList ll = new LinkedList(new Node(1), new Node(2));
      ll.insertAfter(2, 3);
      assert(ll.head.next.next.getValue() == 3);
    }


    @Test void reverseLinkedList() {
      LinkedList ll = new LinkedList(new Node(1), new Node(2));
      ll.insertAfter(2, 3);
      LinkedList back = ll.reverse();
      LinkedList comp = new LinkedList(new Node(3), new Node(2));
      comp.insertAfter(2, 1);
      assertEquals(comp.toString(), back.toString());
    }

    @Test void testKthFromEnd() {
      LinkedList ll = new LinkedList(new Node(1), new Node(3));
      ll.insertAfter(3, 8);
      ll.insertAfter(8, 2);
      assertEquals(2, ll.kthFromEnd(0));
    }

  @Test void testKthFromEndMiddleVal() {
    LinkedList ll = new LinkedList(new Node(1), new Node(3));
    ll.insertAfter(3, 8);
    ll.insertAfter(8, 2);
    assertEquals(8, ll.kthFromEnd(1));
  }
  @Test void testKthSameLength() {
    LinkedList ll = new LinkedList(new Node(1), new Node(3));
    ll.insertAfter(3, 8);
    ll.insertAfter(8, 2);
    assertEquals(1, ll.kthFromEnd(3));
  }

    @Test void testKthFromEndThrows() {
      LinkedList ll = new LinkedList(new Node(1), new Node(3));
      ll.insertAfter(3, 8);
      ll.insertAfter(8, 2);
      assertThrows(NullPointerException.class, () -> ll.kthFromEnd(6));
    }

    @Test void testKthFromEndIllegalArg() {
      LinkedList ll = new LinkedList(new Node(1), new Node(3));
      ll.insertAfter(3, 8);
      ll.insertAfter(8, 2);
      assertThrows(IllegalArgumentException.class, () -> ll.kthFromEnd(-1));
    }

    @Test void testToStringImpl() {
      Node n = new Node(3);
      Node nx = new Node(4);
      LinkedList ll = new LinkedList(n, nx);
      ll.insert(new Node(2));
      assertEquals(ll.toString(), "{2}->{3}->{4}->NULL");
    }
}
