https://www.codewars.com/kata/5388f0e00b24c5635e000fc6

## Python
```python
def swap_values(args):
    m = args[0]
    args[0] = args[1]
    args[1] = m
```

## JavaScript
```js
function swapValues(...args) {
  var temp = args[0][0];
  args[0][0] = args[0][1];
  args[0][1] = temp;
}
```