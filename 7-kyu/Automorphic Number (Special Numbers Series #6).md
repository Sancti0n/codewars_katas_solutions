https://www.codewars.com/kata/5a58d889880385c2f40000aa

## Python
```python
def automorphic(n):
    a = str(n)
    b = str(n**2)
    return "Automorphic" if a == b[len(b)-len(a):] else "Not!!"
```

## JavaScript
```js
function automorphic(n){
  let a = n.toString();
  let b = (n**2).toString();
  return a == b.substring(b.length-a.length) ? "Automorphic": "Not!!"
}
```

## TypeScript
```ts
export function automorphic(n: number): string {
  let a = n.toString();
  let b = (n**2).toString();
  return a == b.substring(b.length-a.length) ? "Automorphic": "Not!!"
}
```