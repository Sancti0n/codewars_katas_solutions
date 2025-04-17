https://www.codewars.com/kata/55749101ae1cf7673800003e

## Python
```python
def pattern(n):
    if n%2 == 1: n -= 1
    if n<=0: return ""
    s = ""
    i = 2
    while i<=n:
        if i == n:
            s += str(i)*i
            i = i + 2
        else:
            s += str(i)*i + "\n"
            i = i + 2
    return s
```

## JavaScript
```js
function pattern(n){
  if (n%2 > 0) n--;
  if (n <= 0) return ""
  let s = "";
  let i = 2;
  while (i<=n) {
    if (i == n) {
      s += i.toString().repeat(i);
      i = i + 2
    }
    else {
      s += i.toString().repeat(i) + "\n";
      i = i + 2
    }
  }
  return s
}
```