https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145

## Python
```python
def bingo(arr): 
    if 2 in arr and 7 in arr and 9 in arr and 14 in arr and 15 in arr: return "WIN"
    return "LOSE"
```

## JavaScript
```js
function bingo(a) {
  if (a.indexOf(2)>-1 && a.indexOf(7)>-1 && a.indexOf(9)>-1 && a.indexOf(14)>-1 && a.indexOf(15)>-1) return "WIN"
  return "LOSE"
}
```