https://www.codewars.com/kata/5809c661f15835266900010a

## Python
```python
def double_every_other(lst):
    for i in range(len(lst)):
        if i%2: lst[i] = lst[i]*2
    return lst
```

## JavaScript
```js
function doubleEveryOther(a) {
  for (let i=0;i<a.length;i++) {
    if (i%2) a[i] = a[i]*2;
  }
  return a
}
```