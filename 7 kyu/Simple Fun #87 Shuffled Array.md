https://www.codewars.com/kata/589573e3f0902e8919000109

## Python
```python
def shuffled_array(s):
    for i in range(len(s)):
        if s[i] == sum(s[:i]+s[i+1:]):
            s.remove(s[i])
            s.sort(reverse=False)
            return s
```

## JavaScript
```js
function shuffledArray(arr) {
  let s = arr.reduce((p, c) => p + c, 0);
  let i = arr.indexOf(s/2);
  arr.splice(i, 1);
  return arr.sort((a,b)=>a-b)
}
```