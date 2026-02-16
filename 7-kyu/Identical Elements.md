https://www.codewars.com/kata/583ebb9328a0c034490001ba

## Python
```py
def duplicate_elements(m, n):
    for i in m:
        if i in n:
            return True
    for j in n:
        if j in m:
            return True
    return False
```

## JavaScript
```js
function duplicateElements(m, n) {
  for (let i=0;i<m.length;i++) {
    if (m.indexOf(n[i])>-1 || n.indexOf(m[i])>-1) return true
  }
  return false
}
```