https://www.codewars.com/kata/555de49a04b7d1c13c00000e

## Python
```python
def add(*args):
    v = 0
    for i in range(len(args)):
        v += args[i]/(i+1)
    return round(v)
```

## JavaScript
```js
function add(...arg) {
  let v = 0;
  for (let i=0;i<arg.length;i++) v += arg[i]/(i+1);
  return Math.round(v)
}
```