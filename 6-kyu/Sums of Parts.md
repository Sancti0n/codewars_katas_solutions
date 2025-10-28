https://www.codewars.com/kata/5ce399e0047a45001c853c2b

## Python
```python
def parts_sums(ls):
    t = [sum(ls)]
    for i in range(1, len(ls)+1):
        t.append(t[i-1]-ls[i-1])
    return t
```

## PHP
```php
function partsSums($ls) {
  $t = [array_sum($ls)];
  for ($i=1;$i<=count($ls);$i++) {
    $t[] = $t[$i-1]-$ls[$i-1];
  }
  return $t;
}
```

## JavaScript
```js
function partsSums(ls) {
  let t = [ls.reduce((previousValue, currentValue) => previousValue + currentValue, 0)];
  for (let i=1;i<=ls.length;i++) {
    t.push(t[i-1]-ls[i-1]);
  }
  return t
}
```

## Java
```java
class SumParts {
  public static int[] sumParts(int[] ls) {
    int sum = 0;
    int[] arr = new int[ls.length+1];
    for (int i=0;i<ls.length;i++) sum = sum + ls[i];
    arr[0] = sum;
    for (int j=1;j<ls.length;j++) arr[j] = arr[j-1]-ls[j-1];
    return arr;
  }
}
```