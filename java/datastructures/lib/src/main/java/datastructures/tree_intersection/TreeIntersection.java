package datastructures.tree_intersection;

import datastructures.trees.BinaryTree;

import java.util.*;
import java.util.stream.Collectors;

public class TreeIntersection {

  public Set<Integer> treeIntersection(
    BinaryTree<Integer> bt1,
    BinaryTree<Integer> bt2
  ) {
    HashMap<Integer, Integer> storage = new HashMap<>();
    HashMap<Integer, Integer> results = BinaryTree.treeIntersectionFind(
      BinaryTree.treeIntersectionFind(storage, bt1),
      bt2);
    return results
      .entrySet()
      .stream()
      .filter(e -> e.getValue() == 2)
      .map(Map.Entry::getKey)
      .collect(Collectors.toSet());
  }
}
