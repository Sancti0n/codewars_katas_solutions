https://www.codewars.com/kata/58067088c27998b119000451

## JavaScript
```js
function reverseFactorial(num) {
  if (num == 1) return "1!"
  let i = 1, s = 1;
  while (s<num) {
    s *= i;
    i++;
  }
  return s == num ? (i-1)+"!" : "None"
}
```

## Python
```py
def reverse_factorial(num):
    if num == 1: return "1!"
    i, s = 1, 1
    while s<num:
        s *= i
        i += 1
    return str(i-1)+"!" if s == num else "None"
```