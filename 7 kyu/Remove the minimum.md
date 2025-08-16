https://www.codewars.com/kata/563cf89eb4747c5fb100001b

## Python
```python
def remove_smallest(numbers):
    n = numbers.copy()
    if len(n) == 0: return []
    else:
        n.remove(min(n))
        return n
```

## JavaScript
```js
function removeSmallest(numbers) {
  let t = [...numbers];
  t.splice(t.indexOf(Math.min(...t)),1);
  return t
}
```