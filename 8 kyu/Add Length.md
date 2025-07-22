https://www.codewars.com/kata/559d2284b5bb6799e9000047

## Python
```python
def add_length(str_):
    s = str_.split(" ")
    for i in range(len(s)):
        s[i] = s[i] + " " + str(len(s[i]))
    return s
```

## JavaScript
```js
function addLength(str) {
  let s = str.split(" ");
  for (let i=0;i<s.length;i++) s[i] = s[i] + " " + s[i].length.toString();
  return s
}
```