https://www.codewars.com/kata/5324945e2ece5e1f32000370

## JavaScript
```js
function sumStrings(a,b) { 
  return (BigInt(a) + BigInt(b)).toString();
}
```

## Python
```py
def sum_strings(a, b):
    a = a.lstrip('0') or '0'
    b = b.lstrip('0') or '0'
    if len(a)<len(b): a, b = b, a
    b = b.zfill(len(a))
    carry, result = [0, []]
    for i in range(len(a)-1, -1, -1):
        s = (ord(a[i])-48) + (ord(b[i])-48) + carry
        carry = s//10
        result.append(chr(s%10 + 48))
    if carry: result.append('1')
    return ''.join(reversed(result)).lstrip('0') or '0'
```