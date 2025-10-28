https://www.codewars.com/kata/58f8a3a27a5c28d92e000144

## Python
```python
def first_non_consecutive(arr):
    for i in range(1,len(arr)):
        if arr[i-1]+1 != arr[i]: return arr[i]
    return None
```

## JavaScript
```js
function firstNonConsecutive (arr) {
  for (let i=1;i<arr.length;i++) {
    if (arr[i-1]+1 != arr[i]) return arr[i];
  } 
  return null
}
```

## TypeScript
```ts
export function firstNonConsecutive (arr: number[]) : null | number {
  for (let i=1;i<arr.length;i++) {
    if (arr[i-1]+1 != arr[i]) return arr[i];
  } 
  return null
}
```

## Java
```java
class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for(int i=1; i<array.length; i++){
          if(array[i]-array[i-1] != 1)  return array[i];
        }
        return null;
    }
}
```