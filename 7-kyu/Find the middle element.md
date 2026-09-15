https://www.codewars.com/kata/545a4c5a61aa4c6916000755

## JavaScript
```js
function gimme (triplet) {
  return 3 - triplet.indexOf(Math.max(...triplet)) - triplet.indexOf(Math.min(...triplet))
}
```

## Python
```py
def gimme(arr):
    return 3 - arr.index(max(arr)) - arr.index(min(arr))
```