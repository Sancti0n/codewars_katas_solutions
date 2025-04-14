https://www.codewars.com/kata/5738f5ea9545204cec000155

## Python
```python
def count_letters_and_digits(s):
    c = 0
    for i in s:
        if i.isdigit() or i.isalpha(): c += 1
    return c
```

## JavaScript
```js
function countLettersAndDigits(input) {
  let c = 0;
  for (let i=0;i<input.length;i++) {
    if ((/[a-zA-Z0-9]/).test(input[i])) c++;
  }
  return c
}
```