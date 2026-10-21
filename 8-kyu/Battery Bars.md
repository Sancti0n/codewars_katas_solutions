https://www.codewars.com/kata/6ad649de715eb5f5359a7e62

## Python
```py
def battery_bars(percent):
    h = int(percent/20)
    p = 5 - h
    return "[" + "#"*h + "."*p + "]"
```

## JavaScript
```js
function batteryBars(percent) {
  return "[" + "#".repeat(Math.floor(percent/20)) + ".".repeat(5 - Math.floor(percent/20)) + "]";
}
```

## TypeScript
```ts
export function batteryBars(percent: number): string {
  return "[" + "#".repeat(Math.floor(percent/20)) + ".".repeat(5 - Math.floor(percent/20)) + "]";
}
```

## Java
```java
public class Kata {
  public static String batteryBars(int percent) {
    return "[" + "#".repeat(percent/20) + ".".repeat(5 - percent/20) + "]";
  }
}
```