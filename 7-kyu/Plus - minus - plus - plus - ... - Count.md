https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca

## Python
```python
import math

def solution(number):
    return int(math.copysign(1,number))

def catch_sign_change(lst):
    c = 0
    for i in range(len(lst)-1):
        if solution(lst[i]) != solution(lst[i+1]): c += 1
    return c
```

## JavaScript
```js
const vSign = n => {
  if (n>=0) return 1
  else return -1
}

const catchSignChange = arr => {
  let c = 0;
  for (let i=0;i<arr.length-1;i++) {
    if (vSign(arr[i]) != vSign(arr[i+1])) {
      c++;
    }
  }
  return c
};
```