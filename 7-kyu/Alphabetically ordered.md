https://www.codewars.com/kata/5a8059b1fd577709860000f6

## JavaScript
```js
function alphabetic(s) {
  let a = s.split("");
  return a.sort().join("") == s
}
```

## Python
```py
def alphabetic(s):
    return sorted(s) == list(s)
```