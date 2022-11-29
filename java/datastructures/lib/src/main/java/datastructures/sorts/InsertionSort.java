package datastructures.sorts;

import java.util.ArrayList;

public class InsertionSort {
  int[] toBeSorted;

  public int[] insertionSort(int[] tb) {
    for (int i = 1; i < tb.length; i++) {
      int temp = tb[i];
      int j = i - 1;
      while (j >= 0 && tb[j] > temp) {
        tb[j + 1] = tb[j];
        j = j -1;
      }
      tb[j + 1] = temp;
    }
    return tb;
  }
}
