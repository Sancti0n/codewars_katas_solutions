https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed

## JavaScript
```js
function jumpingNumber(n) {
  let a = "Jumping!!", b = "Not!!";
  if (n<10) return a
  let s = n.toString();
  if (n<100) {
    return Math.abs(s[0]-s[1]) == 1 ? a : b
  }
  for (let i=1;i<s.length-1;i++) {
    if (Math.abs(s[i-1]-s[i]) != 1 || Math.abs(s[i]-s[i+1]) != 1) return b
  }
  return a
}
```

## Python
```python
def jumping_number(n):
    if n<10: return "Jumping!!"
    s = str(n)
    for i in range(len(s)-1):
        if abs(int(s[i])-int(s[i+1])) != 1: return "Not!!"
    return "Jumping!!"
```

## TypeScript
```ts
export function jumpingNumber(n: number) {
  if (n<10) return "Jumping!!";
  let s = n.toString();
  for (let i=0;i<s.length-1;i++) {
    if (Math.abs(+s[i]- +s[i+1]) !== 1) return "Not!!";
  }
  return "Jumping!!";
}
```