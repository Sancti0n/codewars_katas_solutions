https://www.codewars.com/kata/57acc8c3e298a7ae4e0007e3

## Python
```python
def syracuse(n):
    s = 0
    while n != 1:
        if n%2 == 0:
            n /= 2
            s += 1
        else:
            n = 3*n + 1
            s += 1
    return s

def longest_collatz(input_array):
    t = list(set(input_array))
    s = 0
    f = 0
    for i in t:
        v1 = syracuse(i)
        if s < v1:
            s = v1
            f = i
    return f
```

## JavaScript
```js
function syracuse(n) {
  let s = 0;
  while (n!=1) {
    if (n%2==0) {
      n /= 2;
      s++;
    }
    else {
      n = 3*n + 1
      s++;
    }
  }
  return s
}

function longestCollatz (inputArray) {
  let t = [...new Set(inputArray)];
  let s = 0;
  let f = 0;
  let v = 0;
  for (let i=0;i<t.length;i++) {
    v = syracuse(t[i]);
    if (s<v) {
      s = v;
      f = t[i];
    }
  }
  return f
}
```