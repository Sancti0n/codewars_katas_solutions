https://www.codewars.com/kata/559e3224324a2b6e66000046

## JavaScript
```js
function sumN(n) {
  let s = 0;
  while (n > 0) {
    s += n*(n+1)/2;
    n--;
  }
  return s
}

function sumin(n) {
  return (n**2)*(n+1)/2 - sumN(n-1)
}
function sumax(n) {
  return (n**2)*(n+1)/2 + sumN(n-1)
}
function sumsum(n) {
  return sumin(n) + sumax(n)
}
```

## Python
```python
def sumN(n):
    s = 0
    while n>0:
        s += n*(n+1)/2
        n -= 1
    return s

def sumin(n):
    return (n**2)*(n+1)/2 - sumN(n-1)
    
def sumax(n):
    return (n**2)*(n+1)/2 + sumN(n-1)
    
def sumsum(n):
    return sumin(n) + sumax(n)
```

## TypeScript
```ts
export function sumN(n: number): number {
  let s = 0;
  while (n > 0) {
    s += n*(n+1)/2;
    n--;
  }
  return s
}

export function sumin(n: number): number {
  return (n**2)*(n+1)/2 - sumN(n-1)
}
export function sumax(n: number): number {
  return (n**2)*(n+1)/2 + sumN(n-1)
}
export function sumsum(n: number): number {
  return sumin(n) + sumax(n)
}
```

## PHP
```php
function sumN($n) {
  $s = 0;
  while ($n > 0) {
    $s += $n*($n+1)/2;
    $n--;
  }
  return $s;
}

function sumin($n) {
  return ($n**2)*($n+1)/2 - sumN($n-1);
}
function sumax($n) {
  return ($n**2)*($n+1)/2 + sumN($n-1);
}
function sumsum($n) {
  return sumin($n) + sumax($n);
}
```