https://www.codewars.com/kata/555b73a81a6285b6ce000047

## Python
```python
def add(*args):
    s = 0
    for i in range(len(args)):
        s += args[i]*(i+1)
    return s
```

## JavaScript
```js
function add(...arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    s += arr[i]*(i+1);
  }
  return s
}
```