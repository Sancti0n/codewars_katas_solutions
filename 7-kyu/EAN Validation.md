https://www.codewars.com/kata/55563df50dda59adf900004d

## Python
```python
def validate_ean(code):
    s = 0
    for i in range(len(code)-1):
        if i%2: s += int(code[i])*3
        else: s += int(code[i])
    return 10 - s%10 == int(code[-1]) if s%10 else 0 == int(code[-1])
```

## JavaScript
```js
function validateEAN(eanCode) {
  let s = 0;
  for (let i=0;i<eanCode.length-1;i++) {
    if (i%2) s += +eanCode[i]*3;
    else s += +eanCode[i];
  }
  return s%10 ? 10 - s%10 == +eanCode[eanCode.length-1] : 0 == +eanCode[eanCode.length-1]
}
```