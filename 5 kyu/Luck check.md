https://www.codewars.com/kata/5314b3c6bb244a48ab00076c

## Python
```python
def luck_check(string):
    t = list(map(int, string))
    if len(t)%2 == 0: return sum(t[0:int(len(t)/2)]) == sum(t[int(len(t)/2):])
    return sum(t[0:int(len(t)/2)]) == sum(t[int(len(t)/2)+1:])
```

## JavaScript
```js
function sum(arr, d, f) {
  let s = 0;
  for (let i=d;d<f;d++) s += arr[d];
  return s
}

function somethingThatThrows() {
  throw new Error('Error');
}

function luckCheck(ticket){
  if (isNaN(ticket) || ticket.includes(" ")) {
    somethingThatThrows();
  }
  let t = ticket.split("").map(x => parseInt(x));
  if (t.length%2 == 0) return sum(t, 0, parseInt(t.length/2)) == sum(t, parseInt(t.length/2), t.length)
  return sum(t, 0, parseInt(t.length/2)) == sum(t, parseInt(t.length/2) + 1, t.length)
}
```