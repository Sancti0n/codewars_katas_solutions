https://www.codewars.com/kata/52f3a8e1f85fadcdf7001e31

## JavaScript
```js
function factorialDivision(n, d) {
  let m = BigInt(1);
  while (n>d) {
    m *= n;
    n--;
  }
  return m
}
```

## Python
````python
def factorial_division(n, d):
    m = 1
    while n>d:
        m *= n
        n -= 1
    return m
```