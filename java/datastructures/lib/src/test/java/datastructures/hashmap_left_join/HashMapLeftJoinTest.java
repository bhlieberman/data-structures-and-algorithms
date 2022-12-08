package datastructures.hashmap_left_join;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapLeftJoinTest {

  @Test
  void testLeftJoin() {
    HashMap<String, String> sut1 = new HashMap<>();
    HashMap<String, String> sut2 = new HashMap<>();
    sut1.put("diligent", "employed");
    sut1.put("fond", "enamored");
    sut1.put("guide", "usher");
    sut1.put("outfit", "garb");
    sut1.put("wrath", "anger");
    sut2.put("diligent", "idle");
    sut2.put("fond", "averse");
    sut2.put("guide", "follow");
    sut2.put("flow", "jam");
    sut2.put("wrath", "delight");
    assertEquals("[diligent=employed,idle, outfit=garb, wrath=anger,delight, guide=usher,follow, fond=enamored,averse]", HashMapLeftJoin.leftJoin(sut1, sut2).toString());
  }
}
