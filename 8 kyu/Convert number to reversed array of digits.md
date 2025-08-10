https://www.codewars.com/kata/5583090cbe83f4fd8c000051

## JavaScript
```js
function digitize(n) {
    let i = (n.toString()).length-1
    let t = []
    for (let a=i;a>-1;a--) {
      t.push(Number((n.toString())[a]))
    }
    return t
}
```

## Python
```python
def digitize(n):
    return list(map(int, str(n)[::-1]))
```