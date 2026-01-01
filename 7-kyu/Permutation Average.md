https://www.codewars.com/kata/56b18992240660a97c00000a

## Python
```py
def permutation_average(n):
    if n<10: return n
    nb, s = [str(n), n]
    for i in range(len(nb)-1):
        nb = nb[1:]+nb[0]
        s += int(nb)
    return round(s/len(nb))
```

## JavaScript
```js
function permutationAverage(n) {
  if (n<10) return n
  let nb = n.toString(), s = n;
  for (let i=0;i<nb.length-1;i++) {
    nb = nb.slice(1)+nb[0];
    s += parseInt(nb);
  }
  return Math.round(s/nb.length)
}
```