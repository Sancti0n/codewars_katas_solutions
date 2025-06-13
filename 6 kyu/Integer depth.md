https://www.codewars.com/kata/59b401e24f98a813f9000026

## JavaScript
```js
function computeDepth (n){
  let t = [];
  let i = 1;
  let v = "";
  while (t.length<10) {
    v = (n*i).toString();
    for (let j=0;j<v.length;j++) if (t.indexOf(v[j]) == -1) t.push(v[j]);
    i++;
  }
  return i-1
}
```

## Python
```python
def compute_depth(n):
    t = []
    i = 1
    while len(t)<10:
        v = str(n*i)
        for j in range(len(v)):
            if v[j] not in t: t.append(v[j])
        i += 1
    return i-1
```

## Java
```java
public class MySolution {
  public int computeDepth(int n) {
    String t = "";
    int i = 1;
    String v = "";
    while (t.length()<10) {
      v = String.valueOf(n*i);
      for (int j=0;j<v.length();j++) if (t.indexOf(v.split("")[j]) == -1) t += v.split("")[j];
      i++;
    }
    return i-1;
  }
}
```

## PHP
```php
function compute_depth(int $n): int {
  $t = [];
  $i = 1;
  while (count($t)<10) {
    $v = strval($n*$i);
    for ($j=0;$j<strlen($v);$j++) {
      if (!in_array($v[$j], $t)) {
        $t[] = $v[$j];
      }
    }
    $i++;
  }
  return $i-1;
}
```