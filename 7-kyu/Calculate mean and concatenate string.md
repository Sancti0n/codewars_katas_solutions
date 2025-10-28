https://www.codewars.com/kata/56f7493f5d7c12d1690000b6

## Python
```python
def mean(lst):
    s, c, v = 0, 0, ""
    for i in lst:
        if i.isnumeric():
            s += int(i)
            c += 1
        else: v += i
    return [s/c, v]
```

## JavaScript
```js
function mean(lst) {
  let s = 0, c = 0, v = "";
  for (let i=0;i<lst.length;i++) {
    if (!isNaN(+lst[i])) {
      s += +lst[i];
      c++;
    }
    else v += lst[i];
  }
  return [s/c, v]
}
```