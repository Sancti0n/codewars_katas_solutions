https://www.codewars.com/kata/5270d0d18625160ada0000e4

## JavaScript
```js
function score(dice) {
  let v = [...new Set(dice)];
  let s = 0;
  for (let i=0;i<v.length;i++) {
    if (dice.filter(elt => elt === v[i]).length>=3) {
      if (v[i] == 1) s += 1000;
      else s += v[i]*100
    }
  }
  if (dice.filter(elt => elt === 1).length>3 || dice.filter(elt => elt === 1).length<3) {
    if (dice.filter(elt => elt === 1).length>3) s += (5-dice.filter(elt => elt === 1).length)*100;
    else s += dice.filter(elt => elt === 1).length*100;
  }
  if (dice.filter(elt => elt === 5).length>3 || dice.filter(elt => elt === 5).length<3) {
    if (dice.filter(elt => elt === 5).length>3) s += (5-dice.filter(elt => elt === 5).length)*50;
    else s += dice.filter(elt => elt === 5).length*50;
  }
  return s
}
```

## Python
```python
def score(dice):
    v = list(set(dice))
    s = 0
    for i in v:
        if dice.count(i)>=3:
            if i == 1: s += 1000
            else: s += i*100
    if 1 in v:
        if dice.count(1)<3:
            s += dice.count(1)*100
        if dice.count(1)>3:
            s += (5-dice.count(1))*100
    if 5 in v:
        if dice.count(5)<3:
            s += dice.count(5)*50
        if dice.count(5)>3:
            s += (5-dice.count(5))*50
    return s
```