https://www.codewars.com/kata/5890579a34a7d44f3b00009e

## Python
```python
def manipulate(n):
    if len(str(n))%2 == 1: return int(str(n)[:int(len(str(n))/2)] + int(len(str(n))/2 + 1)*"0")
    return int(str(n)[:int(len(str(n))/2)] + int(len(str(n))/2)*"0")
```

## JavaScript
```js
function manipulate(num) {
  let st = num.toString();
  if (st.length%2) return parseInt(st.substring(0,st.length/2) + "0".repeat(st.length/2 + 1))
  return parseInt(st.substring(0,st.length/2) + "0".repeat(st.length/2))
} 
```