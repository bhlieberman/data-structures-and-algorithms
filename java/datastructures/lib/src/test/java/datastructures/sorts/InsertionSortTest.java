package datastructures.sorts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

  @Test
  void insertionSortTest() {
    InsertionSort is = new InsertionSort();
    int[] arr = {8, 4, 23, 42, 16, 15};
    assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(is.insertionSort(arr)));

  }
}
