https://www.codewars.com/kata/520d9c27e9940532eb00018e

## Python
```python
def solution(*arg):
    return len(arg) != len(list(set(arg)))
```

## JavaScript
```js
function solution(...a) {
  return a.length != [...new Set(a)].length
}
```