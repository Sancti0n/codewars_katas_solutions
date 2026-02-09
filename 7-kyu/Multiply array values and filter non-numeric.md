https://www.codewars.com/kata/55ed875819ae85ca8b00005c

## JavaScript
```js
function multiplyAndFilter(array, multiplier) {
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (typeof array[i] == "number") t.push(array[i]*multiplier); 
  }
  return t
}
```

## Python
```py
def multiply_and_filter(seq, multiplier):
    return [i*multiplier for i in seq if type(i) is int or type(i) is float]
```