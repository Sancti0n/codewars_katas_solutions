https://www.codewars.com/kata/51c89385ee245d7ddf000001

## Python
```python
def solution(value):
    return "Value is "+"0"*(5-len(str(value)))+str(value)
```

## JavaScript
```js
function solution(value) {
  return "Value is "+"0".repeat(5-value.toString().length)+value.toString()
}
```