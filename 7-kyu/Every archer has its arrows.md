https://www.codewars.com/kata/559f89598c0d6c9b31000125

## Python
```python
def archers_ready(archers):
    return min(archers)>=5 if len(archers)>0 else False
```

## JavaScript
```js
function archersReady(archers){
  return archers.length ? Math.min(...archers)>4: false
}
```