https://www.codewars.com/kata/58c9322bedb4235468000019

## Python
```python
def is_very_even_number(n):
    while n>=10:
        n = sum(list(map(int, str(n))))
    return False if n%2 else True
```

## JavaScript
```js
function isVeryEvenNumber(n) {
  while (n>=10) {
    n = Array.from(String(n), Number).reduce((p, c) => p + c, 0);
  }
  return n%2 ? false: true
}
```