https://www.codewars.com/kata/57470efebf81fea166001627

## JavaScript
```js
function letterCheck(arr) {
  let a = [...new Set(arr[0].toLowerCase().split(""))], b = [...new Set(arr[1].toLowerCase().split(""))];
  for (let i=0;i<b.length;i++) {
    if (a.indexOf(b[i])<0) return false
  }
  return true
}
```

## Python
```py
def letter_check(arr):
    a = list(set(arr[0].lower()))
    b = list(set(arr[1].lower()))
    for i in b:
        if i not in a: return False
    return True
```