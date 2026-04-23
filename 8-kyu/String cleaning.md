https://www.codewars.com/kata/57e1e61ba396b3727c000251

## JavaScript
```js
function stringClean(s){
  let w = ''
  for (let i=0;i<s.length;i++) {
    if (isNaN(s[i]) || s[i] === ' ') w += s[i]
  }
  return w
}
```

## Python
```py
def string_clean(s):
    w = ''
    for i in range(len(s)):
        if not s[i].isnumeric(): w += s[i]
    return w
```