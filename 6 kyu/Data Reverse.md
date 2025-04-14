https://www.codewars.com/kata/569d488d61b812a0f7000015

## Python
```python
def data_reverse(data):
    t = data[:8]
    for i in range(1, int(len(data)/8)):
        t = data[i*8:(i+1)*8] + t
    return t
```

## JavaScript
```js
function dataReverse(data) {
  let t = data.slice(0,8);
  for (let i=1;i<data.length/8;i++) {
    t = data.slice(i*8, (i+1)*8).concat(t)
  }
  return t
}
```