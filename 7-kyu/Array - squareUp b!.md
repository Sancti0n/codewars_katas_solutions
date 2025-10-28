https://www.codewars.com/kata/5a8bcd980025e99381000099

## Python
```python
def square_up(n):
    t1 = n*[0]
    t2 = []
    i, j = n, 1
    while i>0:
        t1[i-1] = j
        t2 = t2 + t1
        j += 1
        i -= 1
    return t2
```

## JavaScript
```js
function squareUp(n) {
  let t1 = Array.from({length: n}, (value, index) => 0);
  let t2 = [];
  let i = n, j = 1;
  while (i>0) {
    t1[i-1] = j;
    t2 = t2.concat(t1);
    j++;
    i--;
  }
  return t2
}
```