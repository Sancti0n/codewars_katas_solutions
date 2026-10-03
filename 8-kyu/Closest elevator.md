https://www.codewars.com/kata/5c374b346a5d0f77af500a5a

## JavaScript
```js
function elevator(left, right, call) {
  let l = left, r = right;
  if (call == r || 
      Math.abs(call - l) == Math.abs(call - r) || 
      Math.abs(call - l) > Math.abs(call - r)
     ) {
    return "right";
  }
  return "left";
}
```

## Python
```py
def elevator(left, right, call):
    return "right" if abs(call -left) >= abs(call - right) else "left"
```

## Java
```java
public class Elevator {
  public static String call(int left, int right, int call) {
    return Math.abs(call - left) >= Math.abs(call - right) ? "right" : "left";
  }
}
```

## PHP
```php
function elevator($left, $right, $call) {
  return abs($call - $left) >= abs($call - $right) ? "right" : "left";
}
```