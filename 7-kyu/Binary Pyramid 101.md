https://www.codewars.com/kata/5596700a386158e3aa000011

## JavaScript
```js
function binaryPyramid(m,n){
  let s = 0;
  while (m<=n) {
    s += parseInt(m.toString(2));
    m++;
  }
  return s.toString(2)
}
```

## Python
```python
def binary_pyramid(m,n):
    s = 0
    while m<=n:
        s += int(format(m, 'b'))
        m += 1
    return format(s,'b')
```