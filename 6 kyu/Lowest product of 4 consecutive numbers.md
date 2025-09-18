https://www.codewars.com/kata/554e52e7232cdd05650000a0

## Python
```py
def lowest_product(num):
    if len(num)<5: return "Number is too small"
    s, v = [int(num), 0]
    for i in range(len(num)-3):
        v = int(num[i])*int(num[i+1])*int(num[i+2])*int(num[i+3])
        if s>v: s = v
    return s
```

## JavaScript
```js
function lowestProduct(input) {
  if (input.length<5) return "Number is too small"
  let s = parseInt(input), v = 0;
  for (let i=0;i<input.length-3;i++) {
    v = parseInt(input[i])*parseInt(input[i+1])*parseInt(input[i+2])*parseInt(input[i+3]);
    if (s>v) s = v;
  }
  return s
}
```