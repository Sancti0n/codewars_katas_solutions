https://www.codewars.com/kata/59cd155d1a68b70f8e000117

## JavaScript
```js
function middleMe(N, X, Y) {
  return N%2 ? X : Y.repeat(N/2) + X + Y.repeat(N/2)
}
```

## Python
```py
def middle_me(N, X, Y):
    return X if N%2 else Y*(int(N/2))+X+Y*(int(N/2))
```