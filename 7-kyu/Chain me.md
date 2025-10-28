https://www.codewars.com/kata/54fb853b2c8785dd5e000957

## JavaScript
```js
function chain(input, fs) {
  let v = input;
  for (let i=0;i<fs.length;i++) v = fs[i](v)
  return v
}
```

## Python
```python
def chain(init_val, fs):
    v = init_val
    for i in range(len(fs)): v = fs[i](v)
    return v
```