package datastructures.hashtable;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> {
  ArrayList<LinkedList<HashTablePair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashTable(int size) {
    if (size < 1)
    {
      throw new IllegalArgumentException("HashMap size must be 1 or greater!");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for (int i = 0; i < this.size; i++)
    {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }
  public void set(K key, V value)
  {
    int hashed = hash(key);
    HashTablePair<K, V> pair = new HashTablePair<>(key, value);
    LinkedList<HashTablePair<K, V>> bucket = bucketArrayList.get(hashed);
    if (!bucket.isEmpty()) {
      for (HashTablePair<K, V> t : bucket) {
        if (t.getKey() == key) t.setValue(value);
        return;
      }
    }
    bucket.add(pair);
  }

  public V get(K key)
  {
    int hashed = hash(key);
    LinkedList<HashTablePair<K, V>> bucket = bucketArrayList.get(hashed);
    if (!bucket.isEmpty()) {
      for (HashTablePair<K, V> t : bucket) {
        if (t.getKey() == key) return t.getValue();
      }
    }
    return null;
  }

  public boolean contains(K key)
  {
    int hashed = hash(key);
    LinkedList<HashTablePair<K, V>> bucket = bucketArrayList.get(hashed);
    return bucket.stream().anyMatch(pair -> pair.getKey() == key);
  }

  public List<K> keys()
  {
    return bucketArrayList
      .stream()
      .flatMap(bucket ->
      bucket
        .stream()
        .map(AbstractMap.SimpleEntry::getKey)).toList();
  }

  public int hash(K key)
  {
    return Math.abs(key.hashCode()) % size;
  }
}
