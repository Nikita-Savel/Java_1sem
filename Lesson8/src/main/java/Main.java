import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import map.BaseMap;
import map.MyHashMap;

public class Main {

  private static final List<String> BAD_VALUES = List.of("foo", "bar");

  public static List<Integer> findPrimes(int n) {
    HashSet<Integer> numbers = new HashSet<>();
    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      numbers.add(i);
    }
    while (numbers.iterator().hasNext()) {
      int current = numbers.iterator().next();
      primes.add(current);
      for (int i = current; i <= n; i += current) {
        numbers.remove(i);
      }
    }
    return primes;
  }

  public static void main(String[] args) {

    // create std map
    Map<String, Integer> hashMap = new HashMap<>();
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
    Map<String, Integer> treeMap = new TreeMap<>();
    Map<String, Integer> identityHashMap = new IdentityHashMap<>();
    Map<String, Integer> weakHashMap = new WeakHashMap<>();

    // simple multiMap
    Map<String, List<String>> multiMap = new HashMap<>();


    List<String> list = List.of("a", "a", "a", "b", "c");

    // task 1 with java.util.Map
    Map<String, Integer> res = new HashMap<>();
    for (String s: list) {
      if (res.containsKey(s)) {
        int old = res.get(s);
        res.put(s, old + 1);
      } else {
        res.put(s, 1);
      }
    }
    System.out.println("java.util.Map: " + res);

    // task 1 with MyHashMap
    BaseMap<String, Integer> baseMap = new MyHashMap<>();
    for (String s: list) {
      if (baseMap.containsKey(s)) {
        int old = baseMap.get(s);
        baseMap.put(s, old + 1);
      } else {
        baseMap.put(s, 1);
      }
    }
    System.out.println("MyHashMap: " + baseMap);
  }

  void add(String k, String v, Map<String, List<String>> multiMap) {
    List<String> list = multiMap.computeIfAbsent(k, k1 -> new ArrayList<>());
    list.add(v);
  }

  // ок
  void iterate1(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      String key = e.getKey();
      Integer value = e.getValue();
      System.out.println(key + " -> " + value);
    }
  }

  // не ок
  void iterate2(Map<String, Integer> map) {
    for (String key : map.keySet()) {
      Integer value = map.get(key);
      System.out.println(key + " -> " + value);
    }
  }


  void iterateVals(Map<String, Integer> map) {
    for (Integer value : map.values()) {
      System.out.println(value);
    }
  }

  void iterate3(Map<String, Integer> map) {
    map.forEach((k, v) -> System.out.println(k + " -> " + v));
  }

  void trimVals(Map<String, String > map) {
    for (var entry : map.entrySet()) {
      entry.setValue(entry.getValue().trim());
    }
  }

  void trimAll(Map<String, String > map) {
    map.replaceAll((k, v) -> v.trim());
  }

  void removeSmth1(Map<String, String > map) {
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      if (entry.getValue().equals("foo") || entry.getValue().equals("bar")) {
        iterator.remove();
      }
    }
  }

  void removeSmth2(Map<String, String > map) {
    map.entrySet().removeIf(e ->
        e.getValue().equals("foo") ||
        e.getValue().equals("bar"));
  }

  void removeSmth3(Map<String, String > map) {
    map.values().removeIf(val -> val.equals("foo"));
  }

  void removeSmth4(Map<String, String > map) {
    map.values().removeAll(BAD_VALUES);
  }
}
