https://www.codewars.com/kata/56ba65c6a15703ac7e002075

## JavaScript
```js
function findNextPower(val, pow_) {
  if ((Math.floor(val**(1/pow_))+1)**pow_ == val) {
     return (Math.floor(val**(1/pow_))+2)**pow_
  }
  return (Math.floor(val**(1/pow_))+1)**pow_
}
```

## Python
```python
def find_next_power(val, pow_):
    return (int(val**(1/pow_))+1)**pow_
```