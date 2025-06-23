https://www.codewars.com/kata/57b68bc7b69bfc8209000307

## Python
```python
def average(array):
    return round(sum(array)/len(array))
```

## JavaScript
```js
function average(scores) {
  return Math.round(scores.reduce((p, c) => p + c, 0)/scores.length)
}
```

## TypeScript
```ts
function average(scores) {
  return Math.round(scores.reduce((p, c) => p + c, 0)/scores.length)
}
```