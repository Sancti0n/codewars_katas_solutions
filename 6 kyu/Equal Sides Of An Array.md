https://www.codewars.com/kata/5679aa472b8f57fb8c000047

## Python
```python
def find_even_index(arr):
    for i in range(len(arr)):
        if sum(arr[:i]) == sum(arr[i+1:]): return i
    return -1
```

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function findEvenIndex(arr) {
  for (let i=0;i<arr.length;i++) {
    if (sum(arr.slice(0,i)) == sum(arr.slice(i+1))) return i
  }
  return -1
}
```

## TypeScript
```ts
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function findEvenIndex(arr) {
  for (let i=0;i<arr.length;i++) {
    if (sum(arr.slice(0,i)) == sum(arr.slice(i+1))) return i
  }
  return -1
}
```