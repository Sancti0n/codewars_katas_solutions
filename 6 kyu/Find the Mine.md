https://www.codewars.com/kata/528d9adf0e03778b9e00067e

## Python
```python
def mine_location(field):
    for i in range(len(field)):
        if 1 in field[i]: return [i, field[i].index(1)]
```

## JavaScript
```js
function mineLocation(field) {
  for (let i=0;i<field.length;i++) {
    if (field[i].indexOf(1)>-1) return [i, field[i].indexOf(1)]
  }
}
```