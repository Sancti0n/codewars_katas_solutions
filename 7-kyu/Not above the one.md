https://www.codewars.com/kata/5b5097324a317afc740000fe

## JavaScript
```js
function binaryCleaner(arr) {
  let t1 = [];
  let t2 = [];
  for (let i=0;i<arr.length;i++) {
    if (arr[i]<2) t1.push(arr[i]);
    else t2.push(i);
  }
  return [t1, t2]
}
```

## Python
```python
def binary_cleaner(arr):
    t1, t2 = [], []
    for i in range(len(arr)):
        t1.append(arr[i]) if arr[i]<2 else t2.append(i)
    return (t1, t2)
```