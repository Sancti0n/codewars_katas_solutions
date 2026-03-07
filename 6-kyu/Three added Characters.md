https://www.codewars.com/kata/5971b219d5db74843a000052

## JavaScript
```js
function addedChar(s1, s2) {
  s1 = s1.split("");
  s2 = s2.split("");
  s1.sort();
  s2.sort();
  for (let i=0;i<s1.length;i++) {
    if (s1[i] != s2[i]) return s2[i]
  }
  return s2[s2.length - 2]
}
```

## Python
```py
def added_char(s1, s2):
    s1 = list(s1)
    s2 = list(s2)
    s1.sort()
    s2.sort()
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            return s2[i]
    return s2[-2]
```