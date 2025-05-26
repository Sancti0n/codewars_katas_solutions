https://www.codewars.com/kata/57f24e6a18e9fad8eb000296

## Python
```python
def how_much_i_love_you(n):
    d = {0: "I love you", 1: "a little", 2: "a lot", 3: "passionately", 4: "madly", 5: "not at all"}
    if n>6: return d[(n-1)%6]
    return d[n-1]
```

## PHP
```php
function how_much_i_love_you(int $n): string {
  $d = ["I love you", "a little", "a lot", "passionately", "madly", "not at all"];
    if ($n>6) return $d[($n-1)%6];
    return $d[$n-1];
}
```

## JavaScript
```js
function howMuchILoveYou(n) {
  let d = {0: "I love you", 1: "a little", 2: "a lot", 3: "passionately", 4: "madly", 5: "not at all"}
  if (n>6) return d[(n-1)%6]
  return d[n-1]
}
```

## Java
```java
public class Sid {
  public static String howMuchILoveYou(int n) {
    String[] arr = new String[] {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
    if (n>6) return arr[(n-1)%6];
    return arr[n-1];
  }
}
```