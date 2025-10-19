https://www.codewars.com/kata/539a0e4d85e3425cb0000a88

## Python
```python
def add(n):
    return n

class add(int):
	def __call__(self, n):
		return add(self + n)
```

## JavaScript
```js
function add(n) {
  function fn(x) {
    if (x === undefined) return n;
    return add(n + x);
  }
  fn.valueOf = () => n;
  fn.toString = () => n + "";
  return fn;
}
```