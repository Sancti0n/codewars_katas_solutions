https://www.codewars.com/kata/5731861d05d14d6f50000626

## JavaScript
```js
function bigToSmall(arr) {
  let t = [];
  for (let i=0;i<arr.length;i++) {
    for (let j=0;j<arr[i].length;j++) {
      t.push(arr[i][j]);
    }
  }
  t.sort((a,b) => b-a);
  return t.join(">");
}
```

## TypeScript
```ts
export function bigToSmall(arr: number[][]): string {  
  let t = [];
  for (let i=0;i<arr.length;i++) {
    for (let j=0;j<arr[i].length;j++) {
      t.push(arr[i][j]);
    }
  }
  t.sort((a,b) => b-a);
  return t.join(">");
}
```