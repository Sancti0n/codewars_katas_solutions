https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763

## Python
```python
def show_sequence(n):
    if n == 0: return "0=0"
    if n<0: return str(n)+"<0"
    s = str(int(n*(n+1)/2))
    w = ""
    for i in range(n+1):
        if n == i: w += str(i) + " = "
        else: w += str(i) + "+"
    return w + s
```

## JavaScript
```js
var SequenceSum = (function() {
  function SequenceSum() {}

  SequenceSum.showSequence = function(count) {
    if (count==0) return "0=0"
    if (count<0) return count.toString()+"<0"
    let s = (count*(count+1)/2).toString(), v = "";
    for (let i=0;i<=count;i++) {
      if (count == i) v += i.toString() + " = ";
      else v += i.toString() + "+";
    }
    return v+s
  };
  return SequenceSum;
})();
```