https://www.codewars.com/kata/588854201361435f5e0000bd

## Python
```python
def addition(arr):
    return [arr[i]+arr[i+1] for i in range(0, len(arr), 2)]

def multiplication(arr):
    return [arr[i]*arr[i+1] for i in range(0, len(arr), 2)]

def array_conversion(arr):
    c = 0
    while len(arr)>1:
        if c%2:
            arr = multiplication(arr)
            c += 1
        else:
            arr = addition(arr)
            c += 1
    return arr[0]
```

## JavaScript
```js
function manip(arr, c) {
  let t = [];
  if (c%2) {
    for (let i=0;i<arr.length;i+=2) {
      t.push(arr[i]*arr[i+1]);
    }
  }
  else {
    for (let i=0;i<arr.length;i+=2) {
      t.push(arr[i]+arr[i+1]);
    }
  }
  return t
}

function arrayConversion(arr) {
  let c = 0;
  while (arr.length>1) {
    arr = manip(arr, c)
    c++;
  }
  return arr[0]
}
```