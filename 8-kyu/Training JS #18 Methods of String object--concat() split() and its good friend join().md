https://www.codewars.com/kata/57280481e8118511f7000ffa

## JavaScript
```js
function splitAndMerge(string, separator) {
  let t = string.split(" ")
  for (let i=0;i<t.length;i++) {
    t[i] = t[i].split("").join(separator)
  }
  return t.join(" ")
}
```

## Python
```python
def split_and_merge(s, sep):
    t = s.split(" ")
    for i in range(len(t)):
        t[i] = sep.join(list(t[i]))
    return " ".join(t)
```