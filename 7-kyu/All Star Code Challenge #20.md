https://www.codewars.com/kata/5865a75da5f19147370000c7

## JavaScript
```js
function addArrays(array1, array2) {
  if (array1.length != array2.length) throw new Error();
  let t = [];
  for (let i=0;i<array1.length;i++) {
      t.push(array1[i]+array2[i]);
  }
  return t
}
```

## Python
```py
def add_arrays(array1, array2):
    if len(array1) != len(array2): raise Exception()
    return [array1[i]+array2[i] for i in range(len(array1))]
```