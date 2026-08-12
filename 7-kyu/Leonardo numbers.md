https://www.codewars.com/kata/5b2117eea454c89d4400005f

## JavaScript
```js
function L(n , L0 , L1 , add) {
  let t = [L0, L1], i = 1;
  while (t.length<n) {
    t.push(t[i]+t[i-1]+add);
    i++;
  }
  return t
}
```

## Python
```py
def L(n, L0, L1, add):
    t, i = [L0, L1], 1
    while len(t)<n:
        t.append(t[i]+t[i-1]+add)
        i += 1
    return t
```