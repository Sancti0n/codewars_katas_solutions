https://www.codewars.com/kata/596ddaccdd42c1cf0e00005c

## Python
```py
def calc(arr):
    i = 0
    while i<len(arr):
        if arr[i]>0:
            arr[i] = arr[i]*arr[i]
        i += 1
    i = 0
    while i<len(arr):
        if i != 0:
            if (i+1)%3 == 0:
                arr[i] = arr[i]*3
            if (i+1)%5 == 0:
                arr[i] = (-1)*arr[i]
        i += 1
    return sum(arr)
```

## JavaScript
```js
var calc = function(a) {
  let i = 0;
  while (i<a.length) {
    if (a[i]>0) {
      a[i] = a[i]*a[i];
    }
    i++;
  }
  i = 1;
  while (i<a.length) {
    if ((i+1)%3 == 0) {
      a[i] = a[i]*3;
    }
    if ((i+1)%5 == 0) {
      a[i] = (-1)*a[i];
    }
    i++;
  }
  return a.reduce((a,b)=>a+b,0)
}
```