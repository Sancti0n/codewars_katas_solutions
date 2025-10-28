https://www.codewars.com/kata/62a611067274990047f431a8

## JavaScript
```js
function alternate(n, firstValue, secondValue){
  let t = [];
  for (let i=0;i<n;i++) {
    if (i%2 === 0) t.push(firstValue);
    else t.push(secondValue);
  }
  return t
}
```

## Python
```python
def alternate(n, first_value, second_value):
    t = []
    for i in range(n):
        if i%2 == 0: t.append(first_value)
        else: t.append(second_value)
    return t
```