https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9

## JavaScript
```js
function rowWeights(array){
  let t1 = [];
  let t2 = [];
  for (let i=0;i<array.length;i++) {
    if (i%2 == 0) t1.push(array[i]);
    else t2.push(array[i]);
  }
  return [t1.reduce((p, c) => p + c, 0), t2.reduce((p, c) => p + c, 0)]
}
```

## Python
```python
def row_weights(array):
    t1 = []
    t2 = []
    for i in range(len(array)):
        if i%2 == 0: t1.append(array[i])
        else: t2.append(array[i])
    return (sum(t1), sum(t2))
```