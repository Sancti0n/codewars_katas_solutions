https://www.codewars.com/kata/5753b987aeb792508d0010e2

## Python
```py
def every(array, interval=0, start_index=0):
    if interval == 0 and start_index == 0:
        return array
    if start_index == 0:
        return [array[i] for i in range(len(array)) if i%interval == 0]
    arr = array[start_index:]
    return [arr[i] for i in range(len(arr)) if i%interval == 0]
```

## JavaScript
```js
function every(arr, interval=0, start=0) {
  if (interval == 0 && start == 0) {
    return arr
  }
  let t = [];
  if (start == 0) {
    for (let i=0;i<arr.length;i++) {
      if (i%interval == 0) t.push(arr[i]);
    }
    return t
  }
  arr = arr.slice(start);
  for (let j=0;j<arr.length;j++) {
    if (j%interval == 0) {
      t.push(arr[j]);
    }
  }
  return t
}
```