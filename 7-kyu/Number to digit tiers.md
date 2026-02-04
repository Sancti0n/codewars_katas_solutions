https://www.codewars.com/kata/586bca7fa44cfc833e00005c

## Python
```py
def create_array_of_tiers(n):
    n = str(n)
    return [n[:i+1] for i in range(len(n))]
```

## JavaScript
```js
function createArrayOfTiers(num) {
  let t = [], n = num.toString();
  for (let i=0;i<n.length;i++) {
    t.push(n.slice(0,i+1))
  }
  return t
}
```