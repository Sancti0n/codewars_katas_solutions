https://www.codewars.com/kata/576bb71bbbcf0951d5000044

## Python
```python
def count_positives_sum_negatives(arr):
    if len(arr) == 0: return []
    else:
        c, somme = 0, 0
        for i in arr:
            if i>0: c += 1
            if i<0: somme += i
    return [c, somme]
```

## JavaScript
```js
function countPositivesSumNegatives(arr) {
  if (arr === null || arr.length === 0) return []
  let c = 0;
  let somme = 0;
  for (let i=0;i<arr.length;i++) {
    if (arr[i]>0) c += 1;
    if (arr[i]<0) somme += arr[i];
  }
  return [c, somme]
}
```

## PHP
```php
function countPositivesSumNegatives($arr) {
  if ($arr == null || count($arr) == 0) return [];
  $c = 0;
  $somme = 0;
  for ($i=0;$i<count($arr);$i++) {
    if ($arr[$i]>0) $c++;
    if ($arr[$i]<0) $somme += $arr[$i];
  }
  return [$c, $somme];
}
```

## Java
```java
public class Kata {
  public static int[] countPositivesSumNegatives(int[] arr) {
    if (arr == null || arr.length == 0) return new int[0];
    int c = 0;
    int somme = 0;
    for (int i=0;i<arr.length;i++) {
      if (arr[i]>0) c++;
      if (arr[i]<0) somme += arr[i];
    }
    return new int[]{c, somme};
  }
}
```

## TypeScript
```ts
export function countPositivesSumNegatives(input: number[] | null): number[] {
  if (input === null || input.length === 0) return []
  let c = 0, somme = 0;
  for (let i=0;i<input.length;i++) {
    if (input[i]>0) c += 1;
    if (input[i]<0) somme += input[i];
  }
  return [c, somme]
}
```