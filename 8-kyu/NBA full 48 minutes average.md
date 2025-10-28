https://www.codewars.com/kata/587c2d08bb65b5e8040004fd

## JavaScript
```js
function pointsPer48(ppg, mpg) {
  if (mpg==0) return 0
  return Math.round(ppg*48/mpg*10)/10
}
```

## Python
```python
def nba_extrap(ppg, mpg):
    if mpg==0: return 0
    return round(ppg*48/mpg,1)
```