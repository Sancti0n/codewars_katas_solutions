The sum of x consecutive integers is y. What is the consecutive integer at position n? Given x, y, and n, solve for the integer. Assume the starting position is 0.

For example, if the sum of 4 consecutive integers is 14, what is the consecutive integer at position 3?

We find that the consecutive integers are [2, 3, 4, 5], so the integer at position 3 is 5.

position(4, 14, 3) == 5

Assume there will always be a sum of x consecutive integers that totals to y and n will never be indexed out of bounds.

## Python
```python
def position(x,y,n):
    n0 = int((y - ((x-1)*x/2))/x)
    l = range(n0, n0+x)
    return l[n]
```

## JavaScript
```js
function position(x, y, n) {
  let n0 = (y - (x-1)*x/2)/x;
  let l =  Array.from({length: Math.ceil(x) }, (_, i) => n0 + i);
  return l[n]
}
```