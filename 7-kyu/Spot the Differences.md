https://www.codewars.com/kata/5881460c780e0dd207000084

## JavaScript
```js
function spot(s1,s2) {
  let t = [];
  for (let i=0;i<s1.length;i++) {
    if (s1[i] != s2[i]) t.push(i);
  }
  return t
}
```

## Python
```py
def spot_diff(s1, s2):
    return [i for i in range(len(s1)) if s1[i] != s2[i]]
```

## TypeScript
```ts
export function spot(s1:string ,s2: string): number[]{
  let t = [];
  for (let i=0;i<s1.length;i++) {
    if (s1[i] != s2[i]) t.push(i);
  }
  return t
}
```