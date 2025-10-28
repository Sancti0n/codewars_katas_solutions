https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c

## Python
```python
def even_numbers(arr,n):
    t = []
    arr = arr[::-1]
    i = 0
    while len(t)<n:
        if arr[i]%2 == 0: t.append(arr[i])
        i += 1
    return t[::-1]
```

## JavaScript
```js
function evenNumbers(arr, n) {
  let t = [];
  arr.reverse();
  let i = 0;
  while (t.length<n) {
    if (arr[i]%2 === 0) t.push(arr[i]);
    i++;
  }
  t.reverse();
  return t
}
```