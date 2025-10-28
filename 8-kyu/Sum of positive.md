https://www.codewars.com/kata/5715eaedb436cf5606000381

## Python
```python
def positive_sum(arr):
    somme = 0
    for i in arr:
        if i>0: somme += i
    return somme
```

## PHP
```php
function positive_sum($arr) {
  $s = 0;
  for ($i=0;$i<count($arr);$i++) if ($arr[$i]>0) $s += $arr[$i];
  return $s;
}
```

## JavaScript
```js
function positiveSum(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) if (arr[i]>0) s += arr[i];
  return s
}
```

## Java
```java
public class Positive{
  public static int sum(int[] arr){
    int s = 0;
    for (int i=0;i<arr.length;i++) {
      if (arr[i]>0) s += arr[i];
    }
    return s;
  }
}
```

## TypeScript
```ts
export function positiveSum(arr:number[]):number {
  let s = 0;
  for (let i=0;i<arr.length;i++) if (arr[i]>0) s += arr[i];
  return s
}
```