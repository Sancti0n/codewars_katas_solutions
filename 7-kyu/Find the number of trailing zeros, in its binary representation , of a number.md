https://www.codewars.com/kata/66e793bba4b1a6f2e8f890e5

## Python
```py
def trailing_zeros(n) ->int:
    s, c = bin(n), 0
    for i in range(len(s)-1, 0, -1):
        if s[i] == "0":
            c += 1
        else:
            return c
```

## TypeScript
```ts
export function trailingZeros(n: number): number {
  let s = n.toString(2), c = 0;
  for (let i = s.length-1;i > 0;i--) {
    if (s[i] == "0") {
      c++;
    }
    else {
      break;
    }
  }
  return c;
}
```

## JavaScript
```js
function trailingZeros(n) {
  let s = n.toString(2), c = 0;
  for (let i = s.length-1;i > 0;i--) {
    if (s[i] == "0") {
      c++;
    }
    else {
      break;
    }
  }
  return c;
}
```