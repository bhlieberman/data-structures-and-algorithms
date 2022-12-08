package datastructures.hashmap_left_join;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLeftJoin {

  public static Set<Map.Entry<String, String>> leftJoin(
    HashMap<String, String> hm1,
    HashMap<String, String> hm2) {
    for (Map.Entry<String, String> e : hm2.entrySet()) {
      String k = e.getKey();
      if (hm1.get(k) != null) {
        hm1.merge(k, hm2.get(k), (v1, v2) -> v1 + "," + v2);
      }
    }
    return hm1.entrySet();
  }
}
