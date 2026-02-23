https://www.codewars.com/kata/56b97b776ffcea598a0006f2

## Python
```py
def bubblesort_once(l):
    t, i, temp = list(l), 1, 0
    while i<len(t):
        if t[i-1]>t[i]:
            temp = t[i]
            t[i] = t[i-1]
            t[i-1] = temp
        i += 1
    return t
```

## JavaScript
```js
function bubblesortOnce(a) {
  let t = [...a], i = 1, temp = 0;
  while (i<t.length) {
    if (t[i-1]>t[i]) {
      temp = t[i-1];
      t[i-1] = t[i];
      t[i] = temp;
    }
    i++;
  }
  return t
}
```