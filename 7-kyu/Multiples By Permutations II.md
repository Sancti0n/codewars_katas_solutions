https://www.codewars.com/kata/5ba178be875de960a6000187

## Python
```python
def find_lowest_int(k):
    p = 1
    while sorted(str(k*p)) != sorted(str((k+1)*p)): p += 1
    return p
```

## JavaScript
```js
function findLowestInt(k) {
  let p = 1;
  while ((k*p).toString().split("").sort().join("") != ((k+1)*p).toString().split("").sort().join("")) p++;
  return p
}
```