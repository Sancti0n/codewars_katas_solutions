https://www.codewars.com/kata/590c4c342ad5cd6a8700005c/train/python

## Python
```python
def prefix_sums_to_suffix_sums(prefix_sums):
    t = [prefix_sums[-1]]
    for i in range(len(prefix_sums)-1):
        t.append(prefix_sums[-1]-prefix_sums[i])
    return t
```

## JavaScript
```js
function prefixSumsToSuffixSums(prefixSums) {
  let t = [prefixSums[prefixSums.length-1]];
  for (let i=0;i<prefixSums.length-1;i++) {
    t.push(prefixSums[prefixSums.length-1]-prefixSums[i]);
  }
  return t
}
```