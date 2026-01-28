https://www.codewars.com/kata/56dc83840a10fee472000ca1

## Python
```py
def is_fibo(a: int, b: int, f: int) -> bool:
    temp = 0
    for i in range(f+1):
        if a == f or b == f: return True
        if a > f or b > f: return False
        temp = a
        a = b
        b = temp + b
```

## JavaScript
```js
function isFibo(a,b,f) {
  let temp = 0;
  while (a < f) {
    temp = a;
    a = b;
    b = temp + a
  }
  return a == f
}
```