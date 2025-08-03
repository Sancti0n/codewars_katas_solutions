https://www.codewars.com/kata/5626b561280a42ecc50000d1

## Python
```python
def sum_dig_pow(a, b):
    t = []
    for i in range(a, b+1):
        c = 0
        for j in range(len(str(i))):
            c += int(str(i)[j])**(j+1)
        if c == i: t.append(i)
    return t
```

## JavaScript
```js
function sumDigPow(a, b) {
  let t = [];
  for (let i=a;i<b;i++) {
    let c = 0;
    for (let j=0;j<i.toString().length;j++) {
      c += parseInt(i.toString()[j])**(j+1);
    }
    if (c === i) t.push(i);
  }
  return t
}
```