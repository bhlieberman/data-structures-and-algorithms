package datastructures.hashtable;

import java.util.AbstractMap;

public class HashTablePair<K, V> extends AbstractMap.SimpleEntry<K, V> {
  public HashTablePair(K key, V value) {
    super(key, value);
  }
}
