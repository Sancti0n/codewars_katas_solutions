https://www.codewars.com/kata/56e2f59fb2ed128081001328

## Python
```python
def print_array(arr):
    w = ""
    for i in range(len(arr)):
        if i == len(arr)-1: w += str(arr[i])
        else :w += str(arr[i])+","
    return w
```

## JavaScript
```js
function printArray(array){
  return array.toString()
}
```