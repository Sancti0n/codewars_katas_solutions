https://www.codewars.com/kata/54599705cbae2aa60b0011a4

## JavaScript
```js
function one(arr, fun) {
  let c = 0
  for (let i=0;i<arr.length;i++) {
    if (fun(arr[i])) c++;
  }
  return c == 1 ? true : false;
}
```

## Python
```py
def one(xs, f):
    return True if len([i for i in xs if f(i)]) == 1 else False
```