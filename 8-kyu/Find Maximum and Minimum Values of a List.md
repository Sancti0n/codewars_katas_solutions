https://www.codewars.com/kata/577a98a6ae28071780000989

## Python
```py
def minimum(arr):
    return min(arr)

def maximum(arr):
    return max(arr)
```

## Java
```java
public class Kata {

  public int min(int[] list) {
    int min = list[0];
    for (int i=1;i<list.length;i++) {
      if (min>list[i]) {
        min = list[i];
      }
    }
    return min;
  }
  
  public int max(int[] list) {
    int max = list[0];
    for (int i=1;i<list.length;i++) {
      if (max<list[i]) {
        max = list[i];
      }
    }
    return max;
  }
}
```

## JavaScript
```js
const min = (list) => Math.min(...list);
const max = (list) => Math.max(...list);
```

## PHP
```php
function maximum($array) {
  return max($array);
}
function minimum($array) {
  return min($array);
}
```

## TypeScript
```ts
export const min = (list: number[]): number => {
  return Math.min(...list);
};

export const max = (list: number[]): number => {
  return Math.max(...list);
};
```