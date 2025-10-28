https://www.codewars.com/kata/57bf599f102a39bb1e000ae5

## JavaScript
```js
var fibsFizzBuzz = function(n) {
  let a = 1, b = 0, s = 0;
  let i = 0;
  let t = [];
  while (i < n) {
    if (a%3 == 0 || a%5 == 0) {
      if (a%3 == 0 && a%5 == 0) t.push("FizzBuzz");
      else if (a%3 == 0) t.push("Fizz");
      else if (a%5 == 0) t.push("Buzz");
    }
    else t.push(a);
    s = a + b;
    b = a;
    a = s;
    i++;
  }
  return t
}
```

## Python
```python
def fibs_fizz_buzz(n):
    a, b, i, s = [1,0,0,0]
    t = []
    while i<n:
        if a%3 == 0 or a%5 == 0:
            if a%3 == 0 and a%5 == 0: t.append("FizzBuzz")
            elif a%3 == 0: t.append("Fizz")
            elif a%5 == 0: t.append("Buzz")
        else: t.append(a)
        s = a + b
        b = a
        a = s
        i += 1
    return t
```