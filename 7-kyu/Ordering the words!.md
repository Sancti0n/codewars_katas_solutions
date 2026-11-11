https://www.codewars.com/kata/55d7e5aa7b619a86ed000070

## JavaScript
```js
function orderWord(s) {
  if (s == null || s.length < 1) {
    return "Invalid String!";
  }
  s = s.split("").sort();
  return s.join("")
}
```

## Python
```py
def order_word(s):
    if s == None or len(s) < 1:
        return "Invalid String!"
    return "".join(sorted(list(s)))
```