https://www.codewars.com/kata/557a2c136b19113912000010

## JavaScript
```js
function reverseIt(data) {
  if (typeof data == "string") return data.split("").reverse().join("");
  if (typeof data == "number") return Number(data.toString().split("").reverse().join(""));
  return data
}
```

## Python
```python
def reverse_it(data):
    if type(data) is str: return data[::-1]
    if type(data) is int: return int(str(data)[::-1])
    if type(data) is float: return float(str(data)[::-1])
    return data
```