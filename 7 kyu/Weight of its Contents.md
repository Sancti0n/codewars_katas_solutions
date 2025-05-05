https://www.codewars.com/kata/53921994d8f00b93df000bea

## Python
```python
def content_weight(bottle_weight, scale):
    x = int(scale.split(" ")[0])
    return bottle_weight/(x+1)*x if "larger" in scale else bottle_weight - bottle_weight*x/(x+1)
```

## JavaScript
```js
function contentWeight(bottleWeight, scale) {
  let x = parseInt(scale.split(" ")[0]);
  return scale.indexOf("larger")>-1 ? bottleWeight/(x+1)*x : bottleWeight - bottleWeight*x/(x+1)
}
```