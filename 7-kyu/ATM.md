https://www.codewars.com/kata/5635e7cb49adc7b54500001c

## Python
```python
def solve(n):
    c = 0
    while n>9:
        if n>=500:
            n -= 500
            c += 1
        elif n>=200:
            n -= 200
            c += 1
        elif n>=100:
            n -= 100
            c += 1
        elif n>=50:
            n -= 50
            c += 1
        elif n>=20:
            n -= 20
            c += 1
        elif n>=10:
            n -= 10
            c += 1
    return c if n == 0 else -1
```

## JavaScript
```js
function solve(n) {
  let c = 0;
  while (n>9) {
    if (n>=500) {
      n -= 500;
      c++;
    }
    else if (n>=200) {
      n -= 200;
      c++;
    }
    else if (n>=100) {
      n -= 100;
      c++;
    }
    else if (n>=50) {
      n -= 50;
      c++;
    }
    else if (n>=20) {
      n -= 20;
      c++;
    }
    else if (n>=10) {
      n -= 10;
      c++;
    }
  }
  return n ? -1 : c
}
```