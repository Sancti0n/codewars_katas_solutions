https://www.codewars.com/kata/557592fcdfc2220bed000042

## JavaScript
```js
function pattern(n){
  if (n<1) return ""
  let t = Array.from(Array(n)).map((e,i)=>(i+1).toString());
  let s = t.join("");
  for (let i=0;i<n-1;i++) {
    s += "\n" + (t.slice(1).concat(t[0])).join("");
    t = t.slice(1).concat(t[0]);
  }
  return s
}
```

## Python
```py
def pattern(n: int) -> str:
    if n<1: return ""
    t = [str(i) for i in range(1, n+1)]
    s = "".join(t)
    for i in range(n-1):
        temp = t[0]
        t = t[1:]
        t.append(temp)
        s += "\n" + "".join(t)
    return s
```