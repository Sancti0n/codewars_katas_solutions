https://www.codewars.com/kata/59dd3ccdded72fc78b000b25

## Python
```python
def whatday(num):
    d = {1: "Sunday",2: "Monday",3: "Tuesday",4: "Wednesday",5: "Thursday",6: "Friday",7: "Saturday"}
    if num in d: return d[num]
    return 'Wrong, please enter a number between 1 and 7'
```

## JavaScript
```js
function whatday(num) {
  let d = {1: "Sunday",2: "Monday",3: "Tuesday",4: "Wednesday",5: "Thursday",6: "Friday",7: "Saturday"};
  if (d.hasOwnProperty(num)) return d[num]
  return "Wrong, please enter a number between 1 and 7"
}
```

## Java
```java
import java.util.HashMap;

public class DayOfWeek {
  public static String getDay(int n) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Sunday");
    map.put(2, "Monday");
    map.put(3, "Tuesday");
    map.put(4, "Wednesday");
    map.put(5, "Thursday");
    map.put(6, "Friday");
    map.put(7, "Saturday");
    if (n<1 || n>7) return "Wrong, please enter a number between 1 and 7";
    return map.get(n);
  }
}
```