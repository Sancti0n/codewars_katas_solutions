https://www.codewars.com/kata/589d237fdfdef0239a00002e

## Python
```py
def abacaba(k):
    c = 0
    while k % 2 < 1:
        k = k // 2
        c += 1
    return chr(97 + c)
```

## JavaScript
```js
function abacaba(k) {
  let c = 0;
  while (k % 2 < 1) {
    k /= 2;
    c++;
  }
  return String.fromCharCode(97 + c);
}
```