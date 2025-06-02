https://www.codewars.com/kata/5a2809dbe1ce0e07f800004d

## Python
```python
def divisible_by_last(n):
    t = list(map(int, str(n)))
    tab = [False]
    for i in range(1, len(t)):
        if t[i-1] == 0:
            tab.append(False)
        else:
            tab.append(t[i] % t[i-1] == 0)
    return tab
```

## JavaScript
```js
function divisibleByLast(n) {
  let t = Array.from(String(n), Number);
  let tab = [false];
  for (let i=1;i<t.length;i++) {
    if (t[i-1] == 0) tab.push(false);
    else tab.push(t[i]%t[i-1] == 0)
  }
  return tab
}
```