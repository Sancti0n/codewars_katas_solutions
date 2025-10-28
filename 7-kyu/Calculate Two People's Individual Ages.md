https://www.codewars.com/kata/58e0bd6a79716b7fcf0013b1

## JavaScript
```js
function getAges(sum,difference) {
  if (sum<0 || difference<0) return null
  let a = (sum+difference)/2, b = (sum-difference)/2;
  if (a<0 || b<0) return null
  return [(sum+difference)/2, (sum-difference)/2]
};
```

## Python
```python
def get_ages(sum_, difference):
    if sum_<0 or difference<0 or sum_-difference<0: return None
    return ((sum_+difference)/2, (sum_-difference)/2)
```