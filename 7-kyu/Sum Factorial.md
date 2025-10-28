https://www.codewars.com/kata/56b0f6243196b9d42d000034

## Python
```python
def factor(n):
    if n == 0: return 1
    else: return n*factor(n-1)

def sum_factorial(lst):
    s = 0
    for i in lst: s += factor(i)
    return s
```

## JavaScript
```js
function facto(n) {
  if (n == 0) return 1
  else return n*facto(n-1)
}

function sumFactorial(arr){
  let s = 0;
  for (let i=0;i<arr.length;i++) s += facto(arr[i]);
  return s
}
```