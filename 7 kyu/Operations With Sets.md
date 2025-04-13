We need a function that receives two arrays, each of them with elements that occur only once. We need to know:

    Number of elements that are present in both arrays
    Number of elements that are present in only one array
    Number of remaining elements in arr1 after extracting the elements of arr2
    Number of remaining elements in arr2 after extracting the elements of arr1

Example

arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
arr2 = [2, 4, 6, 8, 10, 12, 14]

The result is: [4, 8, 5, 3]

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