https://www.codewars.com/kata/5769e0db6a3efea1b1000010

## JavaScript
```js
function peakAndValley(arr) {
  let t = [];
  for (let i=3;i<arr.length-3;i++) {
    if (arr[i]>arr[i-3] && arr[i]>arr[i-2] && arr[i]>arr[i-1] && 
        arr[i]>arr[i+1] && arr[i]>arr[i+2] && arr[i]>arr[i+3] || 
        arr[i]<arr[i-3] && arr[i]<arr[i-2] && arr[i]<arr[i-1] && 
        arr[i]<arr[i+1] && arr[i]<arr[i+2] && arr[i]<arr[i+3]) {
      t.push(arr[i]);
    }
  }
  return t
}
```

## Python
```py
def peak_and_valley(arr):
    t = []
    for i in range(3, len(arr)-3):
        if (arr[i]>arr[i-3] and arr[i]>arr[i-2] and arr[i]>arr[i-1] and 
            arr[i]>arr[i+1] and arr[i]>arr[i+2] and arr[i]>arr[i+3] or 
            arr[i]<arr[i-3] and arr[i]<arr[i-2] and arr[i]<arr[i-1] and 
            arr[i]<arr[i+1] and arr[i]<arr[i+2] and arr[i]<arr[i+3]) :
            t.append(arr[i])
    return t
```