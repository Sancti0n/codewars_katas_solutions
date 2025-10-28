https://www.codewars.com/kata/5a4b16435f08299c7000274f

## Python
```python
def sum_square_even_root_odd(nums):
    even = sum([x**2 for x in nums if x%2 == 0])
    odd = sum([x**(1/2) for x in nums if x%2])
    return round(even + odd, 2)
```

## JavaScript
```js
const sumSquareEvenRootOdd = ns => {
  let s = 0
  for (let i=0;i<ns.length;i++) {
    if (ns[i]%2) s += ns[i]**(1/2);
    else s += ns[i]**2;
  }
  return Math.round(s*100)/100
};
```