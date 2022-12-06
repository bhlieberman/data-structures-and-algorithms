# README

This is an a `FrequencyMap` class that uses the Java Streams API to count the occurrences of each word in a sentence. It has no public API and instead can be tested using the provided test suite.

````
public String frequencyMapStream(String sentence) {
    List<String> words = List.of(sentence.split("\s"));
    return words
      .stream()
      .map(String::toLowerCase)
      .collect(Collectors
        .groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
      .entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .orElseThrow().getKey();
  }
  ````
  
  This method performs the following action on the provided string:
  1. Creates a `java.util.List` of the words by splitting the sentence on whitespace.
  2. Converts the list to a stream, performing these transformations thereupon:
    * converts all words to lowercase to account for the same word appearing in different casings
    * collecting the words into a `java.util.HashMap` with the word as the key and its frequency as the corresponding value
  3. Makes an `EntrySet` of the map's key/value pairs and a stream from this:
    * finds the max value using `Map.Entry.comparingByValue()`
    * uses a `java.util.Optional` to return the matching key or else throw an exception.
