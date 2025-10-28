https://www.codewars.com/kata/58856a06760b85c4e6000055

## Python
```python
def bits_battle(numbers):
    t = [0,0]
    for i in numbers:
        if i%2: t[1] += "{0:b}".format(i).count("1")
        elif i%2 == 0 and i !=0: t[0] += "{0:b}".format(i).count("0")
    return 'odds win' if t[1]>t[0] else 'evens win' if t[1]<t[0] else 'tie'
```

## JavaScript
```js
function count(s, a) {
  return (s.match(new RegExp(a, "g")) || []).length
}

function bitsBattle(numbers) {
  let t = [0,0];
  for (let i=0;i<numbers.length;i++) {
    if (numbers[i]%2) t[1] +=  count(numbers[i].toString(2), "1");
    else if (numbers[i]%2 == 0 && numbers[i] != 0) t[0] += count(numbers[i].toString(2), "0")
  }
  return t[1]>t[0] ? 'odds win' : t[1]<t[0] ? 'evens win' : 'tie'
}
```