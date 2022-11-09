package datastructures.stack_and_queue;

public class AnimalShelter {

  public enum Animal {
    DOG,
    CAT
  }

  Queue storage;

  public AnimalShelter() {
    this.storage = new Queue();
  }

  public void enqueue(Animal animal) {
    this.storage.enqueue(animal.ordinal());
  }
  public Animal dequeue(Animal animal) {
    // using an enum means input cannot be other than the available options
    int first = this.storage.dequeue();
    Animal out;
    if (animal.ordinal() == first) {
      return first == 0 ? Animal.DOG : Animal.CAT;
    } else {
      while (!this.storage.isEmpty()) {
        int next = this.storage.dequeue();
        if (animal.ordinal() == next) {
          out = next == 0 ? Animal.DOG : Animal.CAT;
          return out;
        }
      }
    }
    return null;
  }
}
