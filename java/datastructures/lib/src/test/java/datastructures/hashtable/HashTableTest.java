package datastructures.hashtable;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {

  @Test
  void testHashTableSetAndGet() {
    HashTable<String, Integer> h = new HashTable<>(3);
    h.set("hello", 1);
    h.set("foo", 2);
    assertEquals(2, h.get("foo"));
  }

  @Test
  void testHashTableContains() {
    HashTable<String, Integer> h = new HashTable<>(3);
    h.set("hello", 1);
    h.set("foo", 2);
    assertTrue(h.contains("foo"));
  }

  @Test
  void testKeysEmpty() {
    HashTable<?, ?> h = new HashTable<>(3);
    assertTrue(h.keys().isEmpty());
  }

  @Test
  void testKeysSome() {
    HashTable<Integer, String> h = new HashTable<>(19);
    IntStream.range(0,20).forEach(i -> {
      h.set(i, "foo" + i);
    });
    assertTrue(h.keys().size() == 19);
  }
}
