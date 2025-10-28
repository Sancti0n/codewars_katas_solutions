https://www.codewars.com/kata/5574940eae1cf7d520000076

## Python
```python
def pattern(n):
    if n%2 == 0: n -= 1
    if n<=0: return ""
    s = ""
    i = 1
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
  if (n%2 < 1) n--;
  if (n <= 0) return ""
  let s = "";
  let i = 1;
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