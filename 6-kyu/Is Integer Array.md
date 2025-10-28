https://www.codewars.com/kata/52a112d9488f506ae7000b95

## JavaScript
```js
function isIntArray(arr) {
    if (typeof arr != "object" || arr === "" || arr === null || !Array.isArray(arr)) return false
    if (arr != null && arr.length == 0) return true
    for (let i = 0; i < arr.length; i++) {
      if (typeof arr[i] != "number" || isNaN(arr[i]) || typeof arr[i] == "number" && parseInt(arr[i]) != arr[i]) return false
    }
    return true
}
```

## Python
```python
def is_int_array(arr):
    if arr == None or arr == "": return False
    if len(arr) == 0: return True
    for i in range(len(arr)):
        if type(arr[i]) != int and type(arr[i]) != float or type(arr[i]) == float and float(int(arr[i])) != arr[i]:
            return False
    return True
```