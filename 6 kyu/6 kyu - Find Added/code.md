You are given two strings (st1, st2) as inputs. Your task is to return a string containing the numbers in st2 which are not in str1. Make sure the numbers are returned in ascending order. All inputs will be a string of numbers.

```
findAdded('4455446', '447555446666'); // '56667'
findAdded('44554466', '447554466'); // '7'
findAdded('9876521', '9876543211'); // '134'
findAdded('678', '876'); // ''
findAdded('678', '6'); // ''
```

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