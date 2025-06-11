https://www.codewars.com/kata/541da001259d9ca85d000688

## Python
```python
def seqlist(first,c,l):
    i = 0
    t = [first]
    while i+1<l:
        t.append(t[i]+c)
        i += 1
    return t
```

## JavaScript
```js
var seqlist = function(first,c,l){
  let i = 0;
  let t = [first];
  while (i+1<l) {
    t.push(t[i]+c);
    i++;
  }
  return t
}
```