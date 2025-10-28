https://www.codewars.com/kata/55d2603d506a40e162000056

## JavaScript
```js
function calculateTotal(team1, team2) {
  let t1s, t2s = [0,0]
  if (team1.length == 0) t1s = 0;
  else t1s = team1.reduce((t, c) => t + c);
  if (team2.length == 0) t2s = 0;
  else t2s = team2.reduce((t, c) => t + c);
  return t1s > t2s;
}
```

## Python
```python
def calculate_total(t1, t2):
    return sum(t1)>sum(t2)
```