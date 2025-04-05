Given an array/list [] of n integers , find maximum triplet sum in the array Without duplications .


## JavaScript
```js
function maxTriSum(numbers) {
  let l = [... new Set(numbers)];
  l.sort((a,b)=>a-b);
  let n = l.length;
  return l[n-1]+l[n-2]+l[n-3]
}
```

## Python
```python
def max_tri_sum(numbers):
    l = list(set(numbers))
    l.sort()
    return l[-1]+l[-2]+l[-3]
```