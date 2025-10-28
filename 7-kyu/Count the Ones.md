https://www.codewars.com/kata/5519e930cd82ff8a9a000216

## Python
```python
def hamming_weight(x):
    return list(format(x,"b")).count("1")
```

## JavaScript
```js
function hammingWeight(x){
  let q = x;
  let r = "";
  while (q != 0) {
    r += (q%2).toString();
    q = Math.trunc(q/2);
  }
  return (r.match(new RegExp("1", "g")) || []).length
}
```