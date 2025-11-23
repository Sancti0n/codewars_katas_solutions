https://www.codewars.com/kata/56ebcea1b9d927f9bf000544

## Python
```py
import math

def geometric_meanI(arr):
    t = [i for i in arr if type(i) is int and i>=0]
    e = len(arr)-len(t)
    if len(arr)<11 and e>1 or len(arr)>10 and len(arr)/10<e: return 0
    return math.prod(t)**(1/len(t))
```

## JavaScript
```js
function geometricMeanI(arr) {
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] == "number" && arr[i]>=0) t.push(arr[i]);
  }
  let e = arr.length-t.length;
  if (arr.length<11 && e>1 || arr.length>10 && arr.length/10<=e) return 0
  return (t.reduce((p, c) => p*c, 1))**(1/t.length)
}
```