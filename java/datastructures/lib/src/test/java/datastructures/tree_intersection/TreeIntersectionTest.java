package datastructures.tree_intersection;

import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionTest {
  @Test
  void testTreeIntersection() {
    TreeIntersection ti = new TreeIntersection();
    BinaryTree<Integer> bt1 = new BinaryTree(150, 100, 250);
    bt1.root.leftChild.leftChild = new Node(75);
    bt1.root.leftChild.rightChild = new Node(160);
    bt1.root.leftChild.rightChild.leftChild = new Node(125);
    bt1.root.leftChild.rightChild.rightChild = new Node(175);
    bt1.root.rightChild.rightChild = new Node(350);
    bt1.root.rightChild.rightChild.rightChild = new Node(500);
    bt1.root.rightChild.rightChild.leftChild = new Node(300);
    bt1.root.rightChild.leftChild = new Node(200);

    BinaryTree<Integer> bt2 = new BinaryTree(42, 100, 600);
    bt2.root.leftChild.leftChild = new Node(15);
    bt2.root.leftChild.rightChild = new Node(160);
    bt2.root.leftChild.rightChild.leftChild = new Node(125);
    bt2.root.leftChild.rightChild.rightChild = new Node(175);
    bt2.root.rightChild.rightChild = new Node(350);
    bt2.root.rightChild.rightChild.rightChild = new Node(500);
    bt2.root.rightChild.rightChild.leftChild = new Node(4);
    bt2.root.rightChild.leftChild = new Node(200);

    assertEquals("[160, 100, 500, 200, 125, 350, 175]", ti.treeIntersection(bt1, bt2).toString());
  }
}
