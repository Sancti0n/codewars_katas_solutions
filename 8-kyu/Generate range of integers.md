https://www.codewars.com/kata/55eca815d0d20962e1000106

## Python
```python
def generate_range(min, max, step):
    return list(range(min, max+1, step))
```

## JavaScript
```js
function generateRange(min, max, step){
  let t = [];
  while (min <= max) {
    t.push(min);
    min = min + step;
  }
  return t
}
```