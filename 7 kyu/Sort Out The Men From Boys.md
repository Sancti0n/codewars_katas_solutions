https://www.codewars.com/kata/5af15a37de4c7f223e00012d

## Python
```python
def men_from_boys(arr):
    arr = list(set(arr))
    arr.sort()
    a = []
    b = []
    for i in arr:
        if i%2: b.append(i)
        else: a.append(i)
    return a+b[::-1]
```

## JavaScript
```js
function menFromBoys(arr){
  arr = [...new Set(arr)];
  arr.sort((a,b)=>a-b);
  let a = [];
  let b = [];
  for (let i=0;i<arr.length;i++) {
    if (arr[i]%2) b.push(arr[i]);
    else a.push(arr[i]);
  }
  b.reverse();
  return a.concat(b)
}
```