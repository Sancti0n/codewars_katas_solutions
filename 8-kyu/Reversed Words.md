https://www.codewars.com/kata/51c8991dee245d7ddf00000e

## JavaScript
```js
function reverseWords(str){
  return str.split(' ').reverse().join(' ')
}
```

## PHP
```php
function reverseWords($str) {
  return implode(" ", array_reverse(explode(" ", $str)));
}
```

## Python
```python
def reverse_words(s):
    return " ".join((s.split(" "))[::-1])
```

## Java
```java
import java.util.Arrays;
import java.util.Collections;

public class ReverseWords{
  public static String reverseWords(String str){
    String[] t = str.split(" ");
    Collections.reverse(Arrays.asList(t));
    return String.join(" ", t);
  }
}
```

## TypeScript
```ts
export function reverseWords(str: string): string {
  return str.split(" ").reverse().join(" ");
}
```