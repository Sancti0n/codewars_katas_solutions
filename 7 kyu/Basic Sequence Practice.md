https://www.codewars.com/kata/5436f26c4e3d6c40e5000282

## Python
```python
def sum_of_n(n):
    t = []
    for i in range(abs(n)+1):
        if i == 0: t.append(0)
        else:
            if n<0: t.append(-(i*(i+1)/2))
            else: t.append(i*(i+1)/2)
    return t
```

## JavaScript
```js
function sumOfN(n) {
  let t = [];
  for (let i=0;i<=Math.abs(n);i++) {
    if (i === 0) t.push(0);
    else n<0 ? t.push(-(i*(i+1)/2)) : t.push(i*(i+1)/2);
  }
  return t
};
```