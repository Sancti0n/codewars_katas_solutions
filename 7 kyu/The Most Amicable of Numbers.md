https://www.codewars.com/kata/56b5ebaa26fd54188b000018

## JavaScript
```js
function divN(n) {
  let s = 0;
  let i = 1;
  while (n>i) {
    if (parseInt(n/i) == n/i) s += i;
    i++;
  }
  return s
}

function amicableNumbers(num1, num2) {
  return divN(num1) == num2 && divN(num2) == num1
}
```

## Python
```python
def divN(n):
    s, i = 0, 1
    while n>i:
        if int(n/i) == n/i: s += i
        i += 1
    return s

def amicable_numbers(n1,n2):
    return divN(n1) == n2 and divN(n2) == n1
```