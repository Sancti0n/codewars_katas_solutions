https://www.codewars.com/kata/572ab0cfa3af384df7000ff8

## Python
```python
def shuffle_it(arr, *arg):
    t = arg
    for i in range(len(t)):
        a = t[i][0]
        b = t[i][1]
        m = arr[a]
        arr[a] = arr[b]
        arr[b] = m
    return arr
```

## JavaScript
```js
function shuffleIt(arr,...args){
  let t = args;
  for (let i=0;i<t.length;i++) {
    let a = t[i][0];
    let b = t[i][1];
    let m = arr[a];
    arr[a] = arr[b];
    arr[b] = m;
  }
  return arr
}
```