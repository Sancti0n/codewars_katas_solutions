https://www.codewars.com/kata/68851563123e161332d2a84b

## Python
```py
def has_loop(arr: list[int]) -> bool:
    t = []
    i = 0
    while i<len(arr):
        if arr[i]>=len(arr):
            return False
        if arr[i] in t:
            return True
        t.append(arr[i])
        i = arr[arr[i]]
    return False
```

## JavaScript
```js
function hasLoop(indices) {
  let t = [], i = 0;
  while (i<indices.length) {
    if (indices[i]>=indices.length) {
      return false;
    }
    if (t.indexOf(indices[i])>-1) {
      return true;
    }
    t.push(indices[i]);
    i = indices[indices[i]];
  }
  return false;
}
```