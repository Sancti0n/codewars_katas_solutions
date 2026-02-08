https://www.codewars.com/kata/57cc79ec484cf991c900018d

## JavaScript
```js
function dbSort(a) {
  let t1 = [], t2 = [];
  for (let i=0;i<a.length;i++) {
    if (typeof a[i] == "number") t1.push(a[i]);
    else t2.push(a[i]);
  }
  t1.sort((a,b)=>a-b)
  t2.sort()
  return t1.concat(t2)
}
```

## Python
```py
def db_sort(arr):
    t1, t2 = [], []
    for i in arr:
        if type(i) is int: t1.append(i)
        else: t2.append(i)
    t1.sort()
    t2.sort()
    return t1+t2
```