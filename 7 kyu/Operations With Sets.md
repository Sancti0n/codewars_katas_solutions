https://www.codewars.com/kata/5609fd5b44e602b2ff00003a

## Python
```python
def inter(a, b):
    return len(list(set(a) & set(b)))

def unique(a, b):
    return len(set(a) - set(b)) + len(set(b) - set(a))

def remain(a, b):
    return len(set(a) - (set(a) & set(b)))

def process_2arrays(arr1, arr2):
    return[inter(arr1, arr2), unique(arr1, arr2), remain(arr1, arr2), remain(arr2, arr1)]
```

## JavaScript
```js
function intersect(a, b) {
  return a.filter(x => b.includes(x)).length
}

function unique(a, b) {
  return a.filter(x => !b.includes(x)).concat(b.filter(x => !a.includes(x))).length
}

function remain(a, b) {
  return a.filter(x => !b.includes(x)).length
}

function process2Arrays(arr1, arr2) {
  return [intersect(arr1, arr2), unique(arr1, arr2), remain(arr1, arr2), remain(arr2, arr1)]
}
```