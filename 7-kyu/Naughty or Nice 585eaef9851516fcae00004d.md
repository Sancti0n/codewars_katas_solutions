https://www.codewars.com/kata/585eaef9851516fcae00004d

## JavaScript
```js
function whatListAmIOn(actions) {
  let t = [0, 0];
  for (let i=0;i<actions.length;i++) {
    if ("bfk".indexOf(actions[i][0]) > -1) {
      t[0]++;
    }
    if ("gsn".indexOf(actions[i][0]) > -1) {
      t[1]++;
    }
  }
  return t[0] >= t[1] ? "naughty" : "nice";
}
```

## Python
```py
def what_list_am_i_on(actions):
    t = [0]*2
    for i in actions:
        if i[0] in "bfk":
            t[0] += 1
        if i[0] in "gsn":
            t[1] += 1
    return "naughty" if t[0] >= t[1] else "nice"
```