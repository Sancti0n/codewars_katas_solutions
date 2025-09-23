https://www.codewars.com/kata/5a34f087c5e28462d9000082

## Python
```py
import math

def swap_head_tail(arr):
    if len(arr)%2 == 1: return arr[math.ceil(len(arr)/2):] + [arr[int(len(arr)/2)]] + arr[:math.floor(len(arr)/2)]
    else: return arr[int(len(arr)/2):] + arr[:int(len(arr)/2)]
```

## JavaScript
```js
function swapHeadAndTail(arr) {
  let r = ~~((arr.length + 1)/2), l = ~~(arr.length/2);
  return arr.slice(r).concat(arr.slice(l,r)).concat(arr.slice(0,l))
}
```