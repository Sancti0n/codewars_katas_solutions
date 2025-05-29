https://www.codewars.com/kata/59a9919107157a45220000e1

## JavaScript
```js
const findAll = (array, n) => {
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (array[i] == n) t.push(i);
  }
  return t
}
```

## Python
```python
def find_all(array, n):
    t = []
    for i in range(len(array)):
        if array[i] == n: t.append(i)
    return t
```