https://www.codewars.com/kata/5ff6060ed14f4100106d8e6f

## Python
```python
def uncensor(infected, discovered):
    w = ''
    c = 0
    for i in infected:
        if i == '*':
            w += discovered[c]
            c += 1
        else: w += i
    return w
```

## JavaScript
```js
function uncensor(infected, discovered) {
  let [w, c] = ["", 0];
  for (let i=0;i<infected.length;i++) {
    if (infected[i] === "*") [w, c] = [w + discovered[c], c + 1];
    else w += infected[i];
  }
  return w
}
```