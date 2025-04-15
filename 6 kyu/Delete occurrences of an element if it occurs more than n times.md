https://www.codewars.com/kata/554ca54ffa7d91b236000023

## Python
```python
def delete_nth(order,max_e):
    t = []
    for i in order:
        if t.count(i)<max_e: t.append(i)
    return t
```

## JavaScript
```js
function count(arr, a) {
  return arr.filter(e => e === a).length
}

function deleteNth(arr,n) {
  let t = []
  for (let i=0;i<arr.length;i++) {
    if (count(t, arr[i])<n) t.push(arr[i])
  }
  return t
}
```