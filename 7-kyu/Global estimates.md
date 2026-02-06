https://www.codewars.com/kata/59aa2cccd0a5ffdfa000005b

## Python
```py
def global_estimate(estimates):
    a, b = 0, 0
    for i in range(len(estimates)):
        a += estimates[i][0]
        b += estimates[i][1]
    return (a, (a+b)/2, b)
```

## JavaScript
```js
function globalEstimate(estimates) {
  let a = 0, b = 0;
  for (let i=0;i<estimates.length;i++) {
    a += estimates[i][0], b += estimates[i][1];
  }
  return [a, (a+b)/2, b]
}
```