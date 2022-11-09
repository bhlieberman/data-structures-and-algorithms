package datastructures.stack_and_queue;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

import datastructures.stack_and_queue.AnimalShelter.Animal;

public class AnimalShelterTest {
  @Test
  void testEnqueue() {
    AnimalShelter sut = new AnimalShelter();
    sut.storage.enqueue(1);
    assertEquals(1, sut.storage.front.getValue());
  }

  @Test
  void testDequeue() {
    AnimalShelter sut = new AnimalShelter();
    IntStream.range(0,10).forEach((n) -> {
      if (n % 2 == 0) sut.enqueue(Animal.DOG);
      else sut.enqueue(Animal.CAT);
    });
    assertEquals(Animal.DOG, sut.dequeue(Animal.DOG));
  }
}
