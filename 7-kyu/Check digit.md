https://www.codewars.com/kata/5a2e8c0955519e54bf0000bd

## Python
```python
def check_digit(number, index1, index2, digit):
    return str(digit) in str(number)[min(index1,index2):max(index1,index2)+1]
```

## JavaScript
```js
function checkDigit(s, i1, i2, d) {
  return s.toString().substring(Math.min(i1,i2),Math.max(i1,i2)+1).indexOf(d.toString())>-1
};
```