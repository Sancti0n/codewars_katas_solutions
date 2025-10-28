https://www.codewars.com/kata/5b077ebdaf15be5c7f000077

## TypeScript
```ts
export function countSheep(n: number): string {
  let w = '';
  for (let i=1;i<=n;i++) {
    w += i.toString()+' sheep...';
  }
  return w
}
```

## PHP
```php
function countsheep($n){
  $w = '';
  for ($i=1;$i<=$n;$i++){
    $w .= $i . " sheep...";
  }
  return $w;
}
```

## Python
```python
    w = ''
    for i in range(1, n+1):
        w += str(i)+' sheep...'
    return w
```

## JavaScript
```js
var countSheep = function(n){
  let w = ''
  for (let i=1;i<=n;i++) {
    w += i.toString()+' sheep...'
  }
  return w
}
```

## Java
```java
class Kata {
  public static String countingSheep(int num) {
    String w = "";
    for (int i=1;i<=num;i++) {
      w += String.valueOf(i)+" sheep...";
    }
    return w;
  }
}
```