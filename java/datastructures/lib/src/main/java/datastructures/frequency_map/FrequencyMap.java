package datastructures.frequency_map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyMap {

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

  public String frequencyMap(String sentence) {
    Map<String, Long> words = new HashMap<>();
    for (String word : sentence.split("\s")) {
      Long currentValue = words.get(word);
      if (currentValue != null) words.putIfAbsent(word, currentValue + 1);
      else words.put(word, 1L);
    }
    return Collections.max(words.keySet());
  }
}
