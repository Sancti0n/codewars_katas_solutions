https://www.codewars.com/kata/5412509bd436bd33920011bc

## Python
```py
def maskify(cc):
    return "#"*(len(cc)-4) + cc[-4:]
```

## JavaScript
```js
function maskify(c) {
  if (c.length <=4) return c
    let i = 0;
    let w = '';
    while (i<c.length-4) {
      w += '#';
      i++;
    }
    return w + c.substring(c.length-4)
}
```