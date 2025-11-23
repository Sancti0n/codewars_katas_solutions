https://www.codewars.com/kata/597d75744f4190857a00008d

## Python
```py
def paint_letterboxes(start, finish):
    t = [0]*10
    for i in range(start, finish+1):
        for j in str(i):
            t[int(j)] += 1
    return t
```

## JavaScript
```js
var paintLetterboxes = function(start, end) {
  let t = Array(10).fill(0), st = "";
  for (let i=start;i<=end;i++) {
    st = i.toString();
    for (let j=0;j<st.length;j++) {
      t[parseInt(st[j])]++;
    }
  }
  return t
}
```