https://www.codewars.com/kata/58daa7617332e59593000006

## Python
```python
def find_longest(arr):
    a = 0
    for i in arr:
        if len(str(i))>len(str(a)): a = i
    return a
```

## JavaScript
```js
function findLongest(arr){
  let a = 0;
  for (let i=0;i<arr.length;i++) {
    if (arr[i].toString().length>a.toString().length) a = arr[i];
  }
  return a
}
```