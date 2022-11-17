package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
  @Test
  void testBTreeConstructor() {
    BinaryTree bt = new BinaryTree(3, 4, 5);
    assertEquals(5, bt.root.rightChild.getValue());
  }

  @Test
  void testBTreePreOrder() {
    BinaryTree bt = new BinaryTree(3, 4, 5);
    List<Integer> o = new ArrayList<>();
    bt.root.leftChild.leftChild = new Node(1);
    bt.root.leftChild.rightChild = new Node(2);
    assertEquals("[3, 4, 1, 2, 5]", Arrays.toString(bt.preOrder(bt.root, o).toArray()));
  }

  @Test
  void testBTreePostOrder() {
    BinaryTree bt = new BinaryTree(3, 4, 5);
    List<Integer> o = new ArrayList<>();
    bt.root.leftChild.leftChild = new Node(1);
    bt.root.leftChild.rightChild = new Node(2);
    assertEquals("[1, 2, 4, 5, 3]", Arrays.toString(bt.postOrder(bt.root, o).toArray()));
  }

  @Test
  void testBTreeInOrder() {
    BinaryTree bt = new BinaryTree(3, 4, 5);
    List<Integer> o = new ArrayList<>();
    bt.root.leftChild.leftChild = new Node(1);
    bt.root.leftChild.rightChild = new Node(2);
    assertEquals("[1, 4, 2, 3, 5]", Arrays.toString(bt.inOrder(bt.root, o).toArray()));
  }

  @Test
  void testBTreeInOrderMax() {
    BinaryTree bt = new BinaryTree(3, 4, 5);
    List<Integer> o = new ArrayList<>();
    bt.root.leftChild.leftChild = new Node(1);
    bt.root.leftChild.rightChild = new Node(2);
    bt.root.rightChild.leftChild = new Node(17);
    assertEquals(5, bt.inOrderMax(bt.root, o));
  }

  @Test
  void testBSTAdd() {
    BinarySearchTree bt = new BinarySearchTree(4, 3, 5);
    bt.add(1);
    bt.add(17);
    assertEquals(17, bt.root.rightChild.rightChild.getValue());
  }

  @Test
  void testBSTContains() {
    BinarySearchTree bst = new BinarySearchTree(4, 3, 5);
    bst.add(1);
    bst.add(16);
    bst.add(7);
    assert(bst.contains(new Node(7)));
  }

  @Test
  void testBFS() {
    BinaryTree bt = new BinaryTree(2, 7, 5);
    bt.root.leftChild.leftChild = new Node(2);
    bt.root.leftChild.rightChild = new Node(6);
    bt.root.leftChild.rightChild.leftChild = new Node(5);
    bt.root.leftChild.rightChild.rightChild = new Node(11);
    bt.root.rightChild.leftChild = new Node(9);
    bt.root.rightChild.leftChild.rightChild = new Node(4);
    assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 4]",
      Arrays.toString(BinaryTree.breadthFirstSearch(bt).toArray()));
  }

  @Test
  void testKAryTree() {
    BinaryTree bt = new BinaryTree(2, 3, 5);
    bt.root.leftChild.leftChild = new Node(2);
    bt.root.leftChild.rightChild = new Node(6);
    bt.root.leftChild.rightChild.leftChild = new Node(5);
    bt.root.leftChild.rightChild.rightChild = new Node(15);
    bt.root.rightChild.leftChild = new Node(9);
    bt.root.rightChild.leftChild.rightChild = new Node(4);
    assert(BinaryTree.kAryTree(bt, bt.root) != null);
  }
}
