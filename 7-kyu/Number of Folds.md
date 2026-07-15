https://www.codewars.com/kata/59cfe5b023daccfd07000048

## JavaScript
```js
function numberOfFolds(n) {
  return n.toString(2).length-1
}
```

## Python
```py
def number_of_folds(n):
    return len(bin(n)[2:])-1
```