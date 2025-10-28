https://www.codewars.com/kata/55de9c184bb732a87f000055

## JavaScript
```js
function reverse(arr) {
  let c = 0, m = 0;
  while (c<parseInt(arr.length/2)) {
    m = arr[c];
    arr[c] = arr[arr.length-c-1];
    arr[arr.length-c-1] = m;
    c++;
  }
}
```

## Python
```python
def reverse(seq):
    c, m = [0, 0]
    while c<int(len(seq)/2):
        m = seq[c]
        seq[c] = seq[len(seq)-c-1]
        seq[len(seq)-c-1] = m
        c += 1
```