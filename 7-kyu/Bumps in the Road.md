https://www.codewars.com/kata/57ed30dde7728215300005fa

## JavaScript
```js
function bump(x) {
  return (x.match(new RegExp("n", "g")) || []).length<16 ? "Woohoo!": "Car Dead"
}
```

## Python
```python
def bumps(road):
    return "Woohoo!" if road.count("n")<16 else "Car Dead"
```