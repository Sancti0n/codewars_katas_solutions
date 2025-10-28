https://www.codewars.com/kata/57ab3c09bb994429df000a4a

## Python
```python
def two_highest(arg1):
    t = []
    if len(arg1)<1: return []
    if len(arg1)<2: return arg1
    arg1 = list(set(arg1))
    t.append(max(arg1))
    arg1.remove(max(arg1))
    t.append(max(arg1))
    return t
```

## JavaScript
```js
function twoHighest(arr) {
  if (arr.length<2) return arr
  arr = [...new Set(arr)].sort((a,b)=>a-b);
  return [arr[arr.length-1], arr[arr.length-2]]
}
```