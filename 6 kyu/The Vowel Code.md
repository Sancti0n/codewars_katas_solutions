https://www.codewars.com/kata/53697be005f803751e0015aa

## Python
```python
def encode(st):
    return st.replace("a", "1").replace("e", "2").replace("i", "3").replace("o", "4").replace("u", "5")
    
def decode(st):
    return st.replace("1", "a").replace("2", "e").replace("3", "i").replace("4", "o").replace("5", "u")
```

## JavaScript
```js
function encode(st) {
  return st.replaceAll("a", "1").replaceAll("e", "2").replaceAll("i", "3").replaceAll("o", "4").replaceAll("u", "5")
}

function decode(st) {
  return st.replaceAll("1", "a").replaceAll("2", "e").replaceAll("3", "i").replaceAll("4", "o").replaceAll("5", "u")
}
```