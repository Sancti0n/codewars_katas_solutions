https://www.codewars.com/kata/5899e054aa1498da6b0000cc

## Python
```python
def reverse_invert(lst):
    t = []
    for i in lst:
        if isinstance(i, int):
            if i>=0: t.append(-int(str(i)[::-1]))
            else: t.append(int(str(-i)[::-1]))
    return t
```

## JavaScript
```js
function reverseInvert(arr){
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (Number.isInteger(arr[i])) {
      if (arr[i]>=0) t.push(-parseInt(arr[i].toString().split("").reverse().join("")));
      else t.push(parseInt(arr[i].toString().split("").reverse().join("")));
    }
  }
  return t
}
```