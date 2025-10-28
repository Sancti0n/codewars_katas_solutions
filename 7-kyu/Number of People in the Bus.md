https://www.codewars.com/kata/5648b12ce68d9daa6b000099

## Python
```python
def number(bus_stops):
    s = 0
    for i in range(len(bus_stops)):
        s += bus_stops[i][0] - bus_stops[i][1]
    return s
```

## JavaScript
```js
var number = function(busStops){
  let s = 0;
  for (let i=0;i<busStops.length;i++) {
    s = s + busStops[i][0] - busStops[i][1]
  }
  return s
}
```

## Java
```java
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int s = 0;
    for (int i=0;i<stops.size();i++) {
      s += stops.get(i)[0] - stops.get(i)[1];
    }
    return s;
  }
}
```

## PHP
```php
function number($bus_stops) {
  $s = 0;
  for ($i=0;$i<count($bus_stops);$i++) {
    $s += $bus_stops[$i][0] - $bus_stops[$i][1];
  }
  return $s;
}
```