https://www.codewars.com/kata/55ba95a17970ff3e80000064

## Python
```python
def is_ore(n):
    sum=0
    count=0
    for divisor in range(1, n+1):
        if n%divisor == 0:
            count += 1
            sum += divisor
    return n*count%sum == 0
```

## JavaScript
```js
function isOre(n){
  let s = 0;
  let c = 0;
  for (let i=1;i<=n;i++) {
    if (n%i == 0) {
      c++;
      s += i;
    }
  }
  return n*c%s == 0
}
```