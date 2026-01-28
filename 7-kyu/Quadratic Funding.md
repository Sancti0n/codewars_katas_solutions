https://www.codewars.com/kata/670550a8fc404105769b06be

## JavaScript
```js
function qf(donations, pool) {
  let t = [], temp = 0
  for (let i=0;i<donations.length;i++) {
    for (let j=0;j<donations[i].length;j++) {
      temp += donations[i][j]**.5;
    }
    t.push(temp);
    temp = 0
  }
  let weights = 0;
  for (let k=0;k<t.length;k++) {
    weights += t[k]**2;
  }
  let received = []; 
  for (let l=0;l<t.length;l++) {
    received.push(Math.round(pool*t[l]**2/weights));
  }
  return received;
}
```

## Python
```py
def qf(donations: list, pool: int) -> list:
    t, temp = [[], 0]
    for i in range(len(donations)):
        for j in range(len(donations[i])):
            temp += donations[i][j]**.5
        t.append(temp)
        temp = 0
    weights = 0
    for k in range(len(t)):
        weights += t[k]**2
    received = []
    for l in range(len(t)):
        received.append(round(pool*t[l]**2/weights))
    return received
```