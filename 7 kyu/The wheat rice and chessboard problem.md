https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7

## JavaScript
```js
function squaresNeeded(grains) {
  if (grains == 0) return 0
  let n = 1
  while (2**n - 1<grains) n++;
  return n
}
```

## Python
```python
import math

def squares_needed(grains):
    return math.ceil(math.log2(grains+1))
```

## TypeScript
```ts
export function squaresNeeded(grains: number) {
  return Math.ceil(Math.log2(grains+1))
}
```