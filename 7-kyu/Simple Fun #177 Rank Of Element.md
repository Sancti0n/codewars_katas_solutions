https://www.codewars.com/kata/58b8cc7e8e7121740700002d

## Python
```py
def rank_of_element(arr,i):
    c = 0
    for j in range(len(arr)):
        if j<i:
            if arr[j]<=arr[i]: c += 1
        if j>=i:
            if arr[j]<arr[i]: c += 1
    return c
```

## JavaScript
```js
function rankOfElement(arr, i) {
  let c = 0;
  for (let j=0;j<arr.length;j++) {
    if (j<i) {
      if (arr[j] <= arr[i]) c++;
    }
    if (j>=i) {
      if (arr[j] < arr[i]) c++;
    }
  }
  return c
}
```