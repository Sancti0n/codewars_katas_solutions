https://www.codewars.com/kata/59887207635904314100007b

## JavaScript
```js
function closest(arr) {
  if (arr.indexOf(0) > -1) return 0
  let i = 0;
  while (arr.indexOf(i) == -1 && arr.indexOf(-i) == -1) i++;
  if (arr.indexOf(i) > -1 && arr.indexOf(-i) > -1) return null
  return arr.indexOf(-i) > -1 ? -i : i  
}
```

## Python
```python
def closest(lst):
    if 0 in lst: return 0
    i = 0
    while i not in lst and -i not in lst: i += 1
    if i in lst and -i in lst: return None
    return -i if -i in lst else i
```