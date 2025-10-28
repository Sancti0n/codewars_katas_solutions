https://www.codewars.com/kata/550554fd08b86f84fe000a58

## Python
```python
def in_array(array1, array2):
    t = []
    for i in range(len(array2)):
        for j in range(len(array1)):
            if array1[j] in array2[i] and array1[j] not in t:
                t.append(array1[j])
    t.sort()
    return t
```

## JavaScript
```js
function inArray(array1,array2){
  let t = [];
  for (let i=0;i<array2.length;i++) {
    for (let j=0;j<array1.length;j++) {
      if (array2[i].includes(array1[j]) && !t.includes(array1[j])) t.push(array1[j])
    }
  }
  return t.sort()
}
```