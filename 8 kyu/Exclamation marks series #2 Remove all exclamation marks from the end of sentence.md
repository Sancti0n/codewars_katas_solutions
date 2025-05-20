https://www.codewars.com/kata/57faece99610ced690000165

## Python
```python
def remove(s):
    while s[-1]=="!":
        s = s[:-1]
    return s
```

## JavaScript
```js
function remove (string) {
  while (string[string.length-1] == "!") {
    string = string.substring(0,string.length-1);
  }
  return string
}
```