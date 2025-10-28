https://www.codewars.com/kata/5803ee0ed5438edcc9000087

## Python
```python
def padovan(n):
    if n in [0,1,2]: return 1
    lst = [1, 1, 1]
    for i in range(3, n):
        lst.append(lst[i-2] + lst[i-3])
    return lst[-2]+lst[-3]
```

## JavaScript
```js
function padovan(n) {
  if ([0,1,2].indexOf(n)>-1) return 1
  let lst = [1,1,1];
  for (let i=3;i<n;i++) {
    lst.push(lst[i-2]+lst[i-3]);
  }
  return lst[lst.length-2]+lst[lst.length-3]
}
```