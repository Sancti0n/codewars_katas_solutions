https://www.codewars.com/kata/5966847f4025872c7d00015b

## JavaScript
```js
function averageString(str) {
  if (str.length == 0) return "n/a"
  let o = {
    "zero": 0,
    "one": 1,
    "two": 2,
    "three": 3,
    "four": 4,
    "five": 5,
    "six": 6,
    "seven": 7,
    "eight": 8,
    "nine": 9
  };
  let t = str.split(" ");
  let s = 0;
  for (let i=0;i<t.length;i++) {
    if (!o.hasOwnProperty(t[i])) return "n/a"
    else s += o[t[i]];
  }
  s = parseInt(s/t.length);
  return Object.keys(o)[Object.values(o).indexOf(s)]
}
```

## Python
```python
def average_string(s):
    if len(s) == 0: return "n/a"
    o = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    t = s.split(" ")
    sum = 0
    for i in t:
        if i not in o: return "n/a"
        else: sum += o.index(i)
    sum = int(sum/len(t))
    return o[sum]
```