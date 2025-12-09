https://www.codewars.com/kata/66bb6583ac1620f505a8e31b

## JavaScript
```js
function pyramid(s) {
  // return: [vertices, edged, faces, sides]
  return [parseInt(s/4)+1, parseInt(s/4)*2, parseInt(s/4)+1, parseInt(s/4)];
}
```

## Python
```py
def pyramid(s):
    n = int(s/4)
    return (n+1, 2*n, n+1, n)
```