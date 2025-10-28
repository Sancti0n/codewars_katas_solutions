https://www.codewars.com/kata/57096af70dad013aa200007b

## Python
```python
def xor(arr):
    v = arr[0]
    for i in range(1,len(arr)):
        if v == arr[i]: v = False
        else: v = True
    return v

def logical_calc(array, op):
    match op:
        case "AND":return False not in array
        case "OR": return True in array
        case "XOR": return xor(array)
```

## JavaScript
```js
function xor(arr) {
  let v = arr[0];
  for (let i=1;i<arr.length;i++) {
    if (v == arr[i]) v = false;
    else v = true
  }
  return v
}

function logicalCalc(array, op) {
  switch(op) {
      case "AND": return array.indexOf(false) == -1
      case "OR": return array.indexOf(true) > -1
      case "XOR": return xor(array)
  }
}
```