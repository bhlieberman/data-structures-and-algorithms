package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
}