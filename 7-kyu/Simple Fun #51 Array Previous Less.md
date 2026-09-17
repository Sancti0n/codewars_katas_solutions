https://www.codewars.com/kata/588856a82ffea640c80000cc

## Python
```py
def array_previous_less(arr):
    t = []
    for i in range(len(arr)):
        if i == 0:
            t.append(-1)
        else:
            c = i-1
            while c >= 0:
                if arr[c] < arr[i]:
                    t.append(arr[c])
                    break
                c -= 1
            if c < 0:
                t.append(-1)
    return t
```

## JavaScript
```js
function arrayPreviousLess(arr) {
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (i == 0) {
      t.push(-1);
    }
    else {
      let c = i-1;
      while (c >= 0) {
        if (arr[c] < arr[i]) {
          t.push(arr[c]);
          break
        }
        c--;
      }
      if (c < 0) {
        t.push(-1);
      }
    }
  }
  return t;
}
```