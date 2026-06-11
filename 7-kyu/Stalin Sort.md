https://www.codewars.com/kata/699af631058f5c12b04f4efe

## Python
```py
def stalin_sort(arr):
    if len(arr) < 1:
        return None
    i = 1
    while i<len(arr):
        if arr[i-1]>arr[i]:
            arr.pop(i)
        else:
            i += 1
```

## JavaScript
```js
function stalinSort(arr) {
  if (arr.length < 1) {
    return undefined;
  }
  let i = 1;
  while (i<arr.length) {
    if (arr[i-1]>arr[i]) {
      arr.splice(i, 1);
    }
    else {
      i++;
    }
  }
}
```

## TypeScript
```ts
export function stalinSort(arr: number[]): void {
  if (arr.length < 1) {
    return undefined;
  }
  let i = 1;
  while (i<arr.length) {
    if (arr[i-1]>arr[i]) {
      arr.splice(i, 1);
    }
    else {
      i++;
    }
  }
}
```