https://www.codewars.com/kata/58649884a1659ed6cb000072

## Python
```python
def update_light(current):
    d = {
        "green": "yellow",
        "yellow": "red",
        "red": "green"
    }
    return d[current]
```

## JavaScript
```js
function updateLight(current) {
  return {"green": "yellow","yellow": "red","red": "green"}[current]
}
```

## Java
```java
import java.util.HashMap;

public class TrafficLights {
  public static String updateLight(String current) {
    HashMap<String, String> map = new HashMap<>();
    map.put("green", "yellow");
    map.put("yellow", "red");
    map.put("red", "green");
    return map.get(current);
  }
}
```