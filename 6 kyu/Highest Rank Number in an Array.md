https://www.codewars.com/kata/5420fc9bb5b2c7fd57000004

## Python
```python
def highest_rank(arr):
    v = arr[0]
    arr.sort()
    for i in arr:
        if arr.count(i)>=arr.count(v):
            v = i
    return v
```

## JavaScript
```js
function highestRank(arr){
  arr.sort((a,b)=>a-b);
  let v = arr[0];
  for (let i=0;i<arr.length;i++) {
    if (arr.filter(e => e === v).length <= arr.filter(e => e === arr[i]).length) v = arr[i];
  }
  return v
}
```