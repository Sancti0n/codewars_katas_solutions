https://www.codewars.com/kata/57ed4cef7b45ef8774000014

## JavaScript
```js
function boredom(staff) {
  let d = {
    "accounts": 1,
    "finance": 2,
    "canteen": 10,
    "regulation": 3,
    "trading": 6,
    "change": 6,
    "IS": 8,
    "retail": 5,
    "cleaning": 4,
    "pissing about": 25
  }
  let s = 0;
  for (let p in staff) {
    s += d[staff[p]];
  }
  return s>99 ? "party time!!" : s>80 ? "i can handle this" : "kill me now"
}
```

## Python
```py
def boredom(staff):
    d = {
        "accounts": 1,
        "finance": 2,
        "canteen": 10,
        "regulation": 3,
        "trading": 6,
        "change": 6,
        "IS": 8,
        "retail": 5,
        "cleaning": 4,
        "pissing about": 25
    }
    s = sum([d[staff[i]] for i in staff])
    return "party time!!" if s>99 else "i can handle this" if s>80 else "kill me now"
```

## Java
```java
import java.util.HashMap;
import java.util.Map;

public class TheOffice {
  public static String boredom(Person[] staff) {
    Map<String, Integer> d = new HashMap<>();
    d.put("accounts", 1);
    d.put("finance", 2);
    d.put("canteen", 10);
    d.put("regulation", 3);
    d.put("trading", 6);
    d.put("change", 6);
    d.put("IS", 8);
    d.put("retail", 5);
    d.put("cleaning", 4);
    d.put("pissing about", 25);
    int s = 0;
    for (Person p : staff) {
      s += d.get(p.department);
    }
    return s>99 ? "party time!!" : s>80 ? "i can handle this" : "kill me now";
  }
}
```