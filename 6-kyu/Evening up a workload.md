https://www.codewars.com/kata/56431c04ed1454a35d00003b/

## Python
```python
def split_workload(workload):
    if workload == []: return (None, None)
    min, c = [abs(sum(workload)), 0]
    for i in range(len(workload)):
        if min>abs(sum(workload[:i])-sum(workload[i:])):
            min = abs(sum(workload[:i])-sum(workload[i:]))
            c = i
    return (c, min)
```

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function splitWorkload(workload) {
  if (workload.length == 0) return [null, null]
  let min = Math.abs(sum(workload)), c = 0;
  for (let i=0;i<workload.length;i++) {
    if (min > Math.abs(sum(workload.slice(0,i))-sum(workload.slice(i)))) {
      min = Math.abs(sum(workload.slice(0,i))-sum(workload.slice(i)))
      c = i;
    }
  }
  return [c, min]
}
```