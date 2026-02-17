https://www.codewars.com/kata/58069e4cf3c13ef3a6000168

## JavaScript
```js
function reverse(n) {
  let t = [], a = 0, i = -1;
  while (n>0) {
    if (n<10) {
      t.push(n);
      n = 0;
      i++;
    }
    else {
      t.push(n-parseInt(n/10)*10);
      n = parseInt(n/10);
      i++;
    }
  }
  for (let j=0;j<t.length;j++) {
    a += t[j]*10**i;
    i--;
  }
  return a
}
```

## Python
```py
def reverse(n):
    t = []
    a, i = 0, -1
    while n>0:
        if n<10: 
            t.append(n)
            n = 0
            i += 1
        else:
            t.append(n-(n//10)*10)
            n = n//10
            i += 1
    for b in t:
        a += b*10**i
        i -= 1
    return a
```