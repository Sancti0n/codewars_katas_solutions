https://www.codewars.com/kata/5875b200d520904a04000003

## Python
```python
def enough(cap, on, wait):
    if cap <= on+wait: return wait-cap+on
    return 0
```

## JavaScript
```js
function enough(cap, on, wait) {
  if (cap <= on+wait) return wait-cap+on
  return 0
}
```

## PHP
```php
function enough($cap, $on, $wait) {
  if ($cap <= $on+$wait) return $wait-$cap+$on;
  return 0;
}
```

## Java
```java
public class Bob {
  public static int enough(int cap, int on, int wait){
    if (cap <= on+wait) return wait-cap+on;
    return 0;
  }
}
```