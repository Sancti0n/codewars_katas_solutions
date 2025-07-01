https://www.codewars.com/kata/586beb5ba44cfc44ed0006c3

## Python
```python
def sum_even_numbers(seq): 
    s = 0
    for i in seq:
        if i%2 == 0: s += i
    return s
```

## JavaScript
```js
function sumEvenNumbers(input) {
  let s = 0;
  for (let i=0;i<input.length;i++) {
    if (input[i]%2 == 0) s += input[i];
  }
  return s
}
```