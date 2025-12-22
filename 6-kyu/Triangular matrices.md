https://www.codewars.com/kata/551602850cc0afa0a60000e6

## Python
```py
def upper_triangular(mat):
    for i in range(len(mat)):
        if mat[i][:i] != [0]*len(mat[i][:i]): return False
    return True

def lower_triangular(mat):
    for i in range(len(mat)):
        if mat[i][i+1:] != [0]*len(mat[i][i+1:]): return False
    return True
```

## JavaScript
```js
function upperTriangular(mat) {
  let t = [];
  for (let i=0;i<mat.length;i++) {
    t = mat[i].slice(0, i);
    for (let j=0;j<t.length;j++) {
      if (t[j] != 0) return false
    }
  }
  return true
}

function lowerTriangular(mat){
  let t = [];
  for (let i=0;i<mat.length;i++) {
    t = mat[i].slice(i+1);
    for (let j=0;j<t.length;j++) {
      if (t[j] != 0) return false
    }
  }
  return true
```