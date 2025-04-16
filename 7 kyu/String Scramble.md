https://www.codewars.com/kata/5822d89270ca28c85c0000f3

## Python
```python
def scramble(strng, array):
    t = list(range(len(array)))
    for i in range(len(strng)):
        t[array[i]] = strng[i]
    return "".join(t)
```

## JavaScript
```js
function scramble(str, arr) {
  let t = [...Array(arr.length).keys()];
  for (let i=0;i<str.length;i++) {
    t[arr[i]] = str[i];
  }
  return t.join("")
};
```