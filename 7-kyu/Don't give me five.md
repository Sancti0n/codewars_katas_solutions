https://www.codewars.com/kata/5813d19765d81c592200001a

## Python
```python
def dont_give_me_five(start,end):
    count = 0
    for i in range(start, end+1):
        if str(5) not in str(i): count += 1
    return count
```

## PHP
```php
function dont_give_me_five($start, $end) {
  $count = 0;
  $t = range($start, $end);
  for ($i=0;$i<count($t);$i++) {
    if (!str_contains($t[$i], "5")) $count++;
  }
  return $count;
}
```

## JavaScript
```js
function dontGiveMeFive(start, end) {
  count = 0;
  for (let i=start;i<=end;i++) {
    if (!i.toString().includes("5")) count++;
  }
  return count
}
```

## Java
```java
public class Kata {
  public static int dontGiveMeFive(int start, int end) {
    int c = 0;
    for (int i=start; i<=end;i++) {
      if (!String.valueOf(i).contains("5")) c++;
    }
    return c;
  }
}
```