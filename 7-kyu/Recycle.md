https://www.codewars.com/kata/59fb783bab11f89202001083

## JavaScript
```js
function recycleMe(arr){
  let t = [0,0,0];
  for (let i=0;i<arr.length;i++) {
    if (arr[i]>0) t[0]++;
    if (arr[i]<0) t[1]++;
    if (arr[i]==0) t[2]++;
  }
  return t
}
```

## Python
```py
def recycle_me(rubbish):
    t = [0]*3
    for i in rubbish:
        if i>0: t[0] += 1
        elif i<0: t[1] += 1
        elif i==0: t[2] += 1
    return (t[0], t[1], t[2])
```