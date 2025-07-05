https://www.codewars.com/kata/574b3b1599d8f897470018f6

## JavaScript
```js
function getRealFloor(n) {
  if (n<=0) return n
  if (n<13) return n-1
  return n-2
}
```

## Python
```python
def get_real_floor(n):
    if n<=0: return n
    if n<13: return n-1
    return n-2
```

## TypeScript
```ts
export function getRealFloor(n: number): number {
  return n<1 ? n : n<13 ? n-1 : n-2
}
```