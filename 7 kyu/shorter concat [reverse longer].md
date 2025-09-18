https://www.codewars.com/kata/54557d61126a00423b000a45

## JavaScript
```js
function shorter_reverse_longer(a,b){
    return a.length>=b.length ? b+a.split("").reverse().join("")+b : a+b.split("").reverse().join("")+a
}
```

## Python
```python
def shorter_reverse_longer(a,b):
    return b+a[::-1]+b if len(a)>=len(b) else a+b[::-1]+a
```

## TypeScript
```ts
export function shorterReverseLonger(a: string, b: string): string {
  return a.length>=b.length ? b+a.split("").reverse().join("")+b : a+b.split("").reverse().join("")+a
}
```