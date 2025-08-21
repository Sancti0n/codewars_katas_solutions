https://www.codewars.com/kata/559a28007caad2ac4e000083

## JavaScript
```js
function fibo(n) {
  let a = 1, b = 0, s = 0, sum = 0, i = 0;
  while (i<n) {
    s = a + b;
    sum += a + b;
    b = a;
    a = s;
    i++;
  }
  return sum+1
}

function perimeter(n) {
    return 4*fibo(n)
}
```

## Python
```python
def fibo(n):
    a, b, i, s, sum = [1,0,0,0,0]
    while i<n:
        s = a+b
        sum += s
        b = a
        a = s
        i += 1
    return sum+1

def perimeter(n):
    return 4*fibo(n)
```

## PHP
```php
function fibo($n) {
  $a = 1;
  $b = 0;
  $s = 0;
  $sum = 0;
  $i = 0;
  while ($i<$n) {
    $s = $a + $b;
    $sum += $a + $b;
    $b = $a;
    $a = $s;
    $i++;
  }
  return $sum+1;
}

function perimeter($n) {
    return 4*fibo($n);
}
```

## TypeScript
```ts
export const perimeter = (n:number):number => {
  let a = 1, b = 0, s = 0, sum = 0, i = 0;
  while (i<n) {
    s = a + b;
    sum += a + b;
    b = a;
    a = s;
    i++;
  }
  return 4*(sum+1)
}
```