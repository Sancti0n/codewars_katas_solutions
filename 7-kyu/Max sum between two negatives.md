https://www.codewars.com/kata/6066ae080168ff0032c4107a

## Python
```py
def max_sum_between_two_negatives(arr):
    s = []
    t = [i for i in range(len(arr)) if arr[i]<0]
    if len(t)<2:
        return -1
    s = [sum(arr[t[j]+1:t[j+1]]) for j in range(len(t)-1)]
    return max(s)
```

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function maxSumBetweenTwoNegatives(arr) {
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (arr[i]<0) {
      t.push(i);
    }
  }
  if (t.length<2) {
    return -1;
  }
  let s = [], temp = [];
  for (let j=0;j<t.length-1;j++) {
    s.push(sum(arr.slice(t[j]+1, t[j+1])));
  }
  return Math.max(...s);
}
```