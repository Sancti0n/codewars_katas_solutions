https://www.codewars.com/kata/587a88a208236efe8500008b

## Python
```py
def sequence_sum(begin_number, end_number, step):
    if (step > 0 and begin_number > end_number) or (step < 0 and begin_number < end_number):
        return 0
    n = (end_number - begin_number) // step
    l = begin_number + n * step
    return (n + 1) * (begin_number + l) // 2
```

## JavaScript
```js
function sequenceSum(begin, end, step) {
  if ((step > 0 && begin > end) || (step < 0 && begin < end)) {
    return 0
  }
  let n = parseInt((end - begin)/step);
  let l = begin + n*step;
  return parseInt((n + 1)*(begin + l)/2)
}
```