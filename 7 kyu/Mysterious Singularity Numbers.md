https://www.codewars.com/kata/6409aa6df4a0b773ce29cc3d

## Python
```python
def real_numbers(n):
    return n - n // 2 - n // 3 + n // 6 - n // 5 + n // 10 + n // 15 - n // 30
```

## JavaScript
```js
function realNumbers(n){
  return n - Math.floor(n/2) - Math.floor(n/3) + Math.floor(n/6) - Math.floor(n/5) + Math.floor(n/10) + Math.floor(n/15) - Math.floor(n/30)
}
```