https://www.codewars.com/kata/58999425006ee3f97c00011f

## Python
```python
def passed(lst):
    s, c = 0, 0
    for i in lst:
        if i<=18: 
            s += i
            c += 1
    return round(s/c) if c>0 else 'No pass scores registered.'
```

## JavaScript
```js
function passed (list) {
  let s = 0, c = 0;
  for (let i=0;i<list.length;i++) {
    if (list[i]<19) {
      s += list[i];
      c++;
    }
  }
  return c>0 ? Math.round(s/c): 'No pass scores registered.'
} 
```