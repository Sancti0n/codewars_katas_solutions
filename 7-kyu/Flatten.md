https://www.codewars.com/kata/5250a89b1625e5decd000413

## Python
```py
def flatten(lst):
    t = []
    for i in range(len(lst)):
        if type(lst[i]) != list: t.append(lst[i])
        if type(lst[i]) == list:
            for a in range(len(lst[i])):
                t.append(lst[i][a])
    return t
```

## JavaScript
```js
var flatten = function (arr){
  let t = []
  for (let i=0;i<arr.length;i++) {
    if (typeof(arr[i]) != 'object') t.push(arr[i])
        if (typeof(arr[i]) == 'object')
            for (let a=0;a<arr[i].length;a++) t.push(arr[i][a])
  }
  return t
}
```