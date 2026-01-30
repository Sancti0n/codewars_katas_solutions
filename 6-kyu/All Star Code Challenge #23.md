https://www.codewars.com/kata/5865dd726b56998ec4000185

## JavaScript
```js
function scoring(array) {
  let d = {};
  for (let i=0;i<array.length;i++) {
    d[array[i].name] =
      array[i].normKill*100 +
      array[i].assist*50 +
      array[i].damage*.5 +
      array[i].healing*1 +
      2**(array[i].streak) +
      array[i].envKill*500;
  }
  const sortedD = Object.entries(d).sort(([,a],[,b]) => b - a);
  let t = [];
  for (let i=0;i<sortedD.length;i++) {
    t.push(sortedD[i][0]);
  }
  return t
}
```

## Python
```py
def scoring(arr):
    d = {}
    for i in range(len(arr)):
        d[arr[i]["name"]] = arr[i]["norm_kill"]*100 + arr[i]["assist"]*50 + arr[i]["damage"]*.5 + arr[i]["healing"]*1 + 2**(arr[i]["streak"]) + arr[i]["env_kill"]*500
    t = sorted(d, key=d.get, reverse=True)
    return t
```