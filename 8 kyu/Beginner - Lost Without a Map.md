https://www.codewars.com/kata/57f781872e3d8ca2a000007e

## JavaScript
```js
function maps(x){
  return x.map(x => x * 2)
}
```

## Python
```python
def maps(a):
    r = list(map(lambda x: x + x, a))
    return r
```

## PHP
```php
function div($n) {
  return $n*2;
}

function maps($x) {
  return array_map("div", $x);
}
```

## Java
```java
public class Maps {
  public static int[] map(int[] arr) {
    for (int i=0;i<arr.length;i++) {
      arr[i] = arr[i]*2;
    }
    return arr;
  }
}
```

## TypeScript
```ts
export function maps(x: number[]): number[] {
  return x.map(x => x * 2)
}
```