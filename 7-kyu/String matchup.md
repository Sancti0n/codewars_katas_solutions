https://www.codewars.com/kata/59ca8e8e1a68b7de740001f4

## Python
```py
def solve(a,b):
    return [a.count(i) for i in b]
```

## JavaScript
```js
function solve(a,b) {
  let t = [];
  for (let i=0;i<b.length;i++) {
    let s = 0;
    for (let j=0;j<a.length;j++) {
      if (b[i] == a[j]) s++;
    }
    t.push(s)
  }
  return t
}
```