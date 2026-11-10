https://www.codewars.com/kata/5884615cbd573356ab000050

## JavaScript
```js
function countSumOfTwoRepresentations(n, l, r) {
  const minA = Math.max(l, n - r);
  const maxA = Math.min(r, Math.floor(n / 2));
  return Math.max(0, maxA - minA + 1);
}
```

## Python
```py
def count_sum_of_two_representations(n: int, l: int, r: int) -> int:
    minA = max(l, n-r)
    maxA = min(r, n//2)
    return max(0, maxA - minA + 1)
```