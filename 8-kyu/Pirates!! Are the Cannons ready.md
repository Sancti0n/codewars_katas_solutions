https://www.codewars.com/kata/5748a883eb737cab000022a6

## JavaScript
```js
const cannonsReady = (gunners) => {
  let c = Object.keys(gunners).length, count = 0;
  for (const [k, v] of Object.entries(gunners)) {
    if (v == "aye") count++;
    if (v == "nay") return "Shiver me timbers!"
  }
  return c == count ? "Fire!": "Shiver me timbers!" 
}
```

## Python
```python
def cannons_ready(gunners):
    c = len(gunners)
    count = 0
    for k, v in gunners.items():
        if v == "aye": count += 1
    if c == count: return "Fire!"
    return "Shiver me timbers!"
```