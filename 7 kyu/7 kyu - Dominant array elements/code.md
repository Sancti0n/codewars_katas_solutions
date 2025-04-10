An element in an array is dominant if it is greater than all elements to its right. You will be given an array and your task will be to return a list of all dominant elements. For example:
```
solve([1,21,4,7,5]) = [21,7,5] because 21, 7 and 5 are greater than elments to their right. 
solve([5,4,3,2,1]) = [5,4,3,2,1]
```
Notice that the last element is always included. All numbers will be greater than 0.


## Python
```python
def solve(arr):
    t = []
    for i in range(len(arr)):
        if len([arr[j] for j in range(i+1,len(arr)) if arr[i]<=arr[j]]) == 0: t.append(arr[i])
    return t
```

## JavaScript
```js
function solve(arr) {
  let t = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr.slice(i + 1).find((elt) => elt >= arr[i]) == undefined) {
      t.push(arr[i]);
    }
  }
  return t
}
```