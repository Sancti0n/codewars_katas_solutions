https://www.codewars.com/kata/57d448c6ba30875437000138

## JavaScript
```js
function roots(a,b,c){
  return b**2 - 4*a*c < 0? null: Math.round((-b/a)*100)/100
}
```

## Python
```python
def roots(a,b,c):
    return None if b**2 - 4*a*c < 0 else round(-b/a, 2)
```