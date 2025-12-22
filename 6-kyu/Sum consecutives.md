https://www.codewars.com/kata/55eeddff3f64c954c2000059

## Python
```py
def sum_consecutives(lst):
    i = 0
    t = []
    while i<len(lst):
        if i == 0:
            t.append(lst[i])
            i += 1
        while lst[i-1] == lst[i]:
            t[-1] += lst[i]
            i += 1
            if i+1>len(lst): return t
        if lst[i-1] != lst[i]:
            t.append(lst[i])
            i += 1
    return t
```

## JavaScript
```js
function sumConsecutives(s) {
  let i = 0, t = [];
  while (i<s.length) {
    if (i==0) {
      t.push(s[i]);
      i++;
    }
    while (s[i-1] == s[i]) {
      t[t.length-1] += s[i];
      i++;
      if (i>=s.length) return t
    }
    if (s[i-1] != s[i]) {
      t.push(s[i]);
      i++;
    }
  }
  return t
}
```