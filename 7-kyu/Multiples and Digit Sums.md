https://www.codewars.com/kata/58ca77b9c0d640ecd2000b1e

## Python
```py
def procedure(i):
    a, somme = 1, 0
    t = []
    while a*i<=100:
        t.append(str(a*i))
        a += 1
    for i in t:
        for b in i: somme += int(b)
    return somme
```

## JavaScript
```js
function procedure(n) {
  let a = 1, s = 0, t = [];
  while (a*n<101) {
    t.push((a*n).toString());
    a++;
  }
  for (let i=0;i<t.length;i++) {
    for (let j=0;j<t[i].length;j++) {
      s += parseInt(t[i][j]);
    }
  }
  return s
}
```