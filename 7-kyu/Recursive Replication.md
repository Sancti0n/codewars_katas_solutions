https://www.codewars.com/kata/57547f9182655569ab0008c4

## Python
```python
@countcalls
def replicate(times, number, t=None):
    if times <= 0: return []
    if t is None: t = []
    if times == 1: t.append(number)
    else:
        t.append(number)
        replicate(times-1, number, t)
    return t
```

## JavaScript
```js
function replicate(times, number) {
  if (times > 0) return [number].concat(replicate(times-1, number))
  return []
}
```