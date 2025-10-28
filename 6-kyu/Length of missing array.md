https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611

## Python
```python
def get_length_of_missing_array(array):
    if len(array) == 0 or None in array: return 0
    s = []
    for i in array:
        if i != None and i != []: s.append(len(i))
        else: return 0
    j = min(s)
    while j in s:
        j += 1
    return j
```

## JavaScript
```js
function getLengthOfMissingArray(arr) {
  if (arr == null || arr.length == 0 || arr.indexOf(null)>-1) return 0
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (arr[i] != null && arr[i].length>0) t.push(arr[i].length);
    else return 0
  }
  t.sort((a,b)=>a-b)
  let j = t[0];
  while (t.indexOf(j)>-1) {
    j++;
  }
  return j
}
```