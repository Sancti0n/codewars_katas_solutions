https://www.codewars.com/kata/5a090c4e697598d0b9000004

## JavaScript
```js
function solve(arr) {
  arr.sort((a,b)=>a-b);
  let t = [];
  while (arr.length>2) {
    t.push(arr[arr.length-1], arr[0]);
    arr.shift();
    arr.pop();
  }
  return arr.length>1 ? t.concat([arr[1], arr[0]]) : t.concat([arr[0]])
}
```

## Python
```python
def solve(arr):
    t = [max(arr), min(arr)]
    arr.remove(max(arr))
    arr.remove(min(arr))
    while len(arr)>2:
        t.extend([max(arr), min(arr)])
        arr.remove(max(arr))
        arr.remove(min(arr))
    return t + [max(arr), min(arr)] if len(arr) > 1 else t + [arr[0]] 
```