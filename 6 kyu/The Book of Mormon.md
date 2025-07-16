https://www.codewars.com/kata/58373ba351e3b615de0001c3

## Python
```python
def mormons(starting_number, reach, target):
    s = 0
    while starting_number < target:
        starting_number = starting_number + starting_number*reach
        s += 1
    return s
```

## JavaScript
```js
function Mormons(s, r, t) {
  let a = 0;
  while (s < t) {
    s = s + s*r;
    a++;
  }
  return a
}
```