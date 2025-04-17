https://www.codewars.com/kata/57ad85bb7cb1f3ae7c000039

## Python
```python
def product(arr):
    if len(arr) == 0: return 0
    p = 1
    for i in arr:
        if i>0: p *= i
    return p

def numbers_with_digit_inside(x, d):
    t = []
    for i in range(1,x+1):
        if str(d) in str(i): t.append(i)
    return [len(t)-t.count(0), sum(t), product(t)]
```

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function product(arr) {
    if (arr.length == 0) return 0
    let p = 1;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) p *= arr[i]
    }
    return p
}

function numbersWithDigitInside(x, d) {
  let t = [];
  for (let i=1;i<=x;i++) {
    if (i.toString().includes(d.toString())) t.push(i)
  }
  return [t.length - t.filter(elt => elt === 0).length, sum(t), product(t)];
}
```