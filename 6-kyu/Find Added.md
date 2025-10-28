https://www.codewars.com/kata/58de77a2c19f096a5a00013f

## Python
```python
def find_added(st1, st2):
    s = ""
    t = list(set(st2))
    for j in t:
        s += j*(st2.count(j)-st1.count(j))
    for i in st2:
        if i not in st1 and i not in t: s += i
    return "".join(sorted(s))
```

## JavaScript
```js
function count(arr, a) {
  return (arr.match(new RegExp(a, "g")) || []).length
}

function findAdded(st1, st2){
  let s = "";
  let t = [... new Set(st2)];
  for (let i=0;i<t.length;i++) {
    s += t[i].repeat(count(st2, t[i]) - count(st1, t[i]));
  }
  for (let j=0;j<st2.length;j++) {
    if (st1.indexOf(st2[j])>-1 && t.indexOf(st2[j])<0) {
      s += st2[j];
    }
  }
  s = s.split("").sort((a,b)=>a-b).join("")
  return s;
}
```