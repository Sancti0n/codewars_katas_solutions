https://www.codewars.com/kata/64fbfe2618692c2018ebbddb

## JavaScript
```js
function flickSwitch(arr) {
  let v = true
  for (let i=0;i<arr.length;i++) {
    if (arr[i] == 'flick') {
      arr[i] = !v;
      v = !v;
    }
    else arr[i] = v;
  }
  return arr
}
```

## Python
```py
def flick_switch(lst):
    v = True
    for i in range(len(lst)):
        if (lst[i] == "flick"):
            lst[i] = not v
            v = not v
        else:
            lst[i] = v
    return lst
```