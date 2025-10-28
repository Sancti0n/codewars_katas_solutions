https://www.codewars.com/kata/559e708e72d342b0c900007b

## Python
```python
def even_odd(arr):
    s = arr[0]
    for i in range(1,len(arr)):
        if i%2 == 1:
            s *= arr[i]
        else: s += arr[i]
    return s
```

## JavaScript
```js
function EvenOdd(arr){
  let s = arr[0];
  for (let i=1;i<arr.length;i++) {
    if (i%2) s *= arr[i];
    else s += arr[i];
  }
  return s
}
```