https://www.codewars.com/kata/55a996e0e8520afab9000055

## Python
```python
def cookie(x):
    if type(x) is str: return "Who ate the last cookie? It was Zach!"
    if type(x) is float or type(x) is int: return "Who ate the last cookie? It was Monica!"
    if type(x) is bool: return "Who ate the last cookie? It was the dog!"
```

## JavaScript
```js
function cookie(x){
  if (typeof x == "string") return "Who ate the last cookie? It was Zach!"
  if (typeof x == "number") return "Who ate the last cookie? It was Monica!"
  return "Who ate the last cookie? It was the dog!"
}
```