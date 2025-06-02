https://www.codewars.com/kata/5a1a9e5032b8b98477000004

## Python
```python
def even_last(numbers):
    s = 0
    for i in range(len(numbers)):
        if i%2 == 0: s += numbers[i]
        if i+1 == len(numbers): return s*numbers[len(numbers)-1]
    return s
```

## JavaScript
```js
function evenLast(numbers) {
  let s = 0;
  for (let i=0;i<numbers.length;i++) {
    if (i%2 == 0) s += numbers[i];
    if (i+1 == numbers.length) return s*numbers[numbers.length-1]
  }
  return s
}
```