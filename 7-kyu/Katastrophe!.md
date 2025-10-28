https://www.codewars.com/kata/55a3cb91d1c9ecaa2900001b

## Python
```python
def strong_enough(earthquake, age):
    s = 1
    v = 1000
    for i in earthquake:
        s = sum(i)*s
    for j in range(age):
        v = v-v/100
    return 'Safe!' if v>s else 'Needs Reinforcement!'
```

## JavaScript
```js
function strongEnough(earthquake, age) {
  earthquake = earthquake.reduce((s, v) => s * v.reduce((x, s) => x + s, 0), 1);
  var strength = 1000 * Math.pow(.99, age);
  return strength > earthquake ? 'Safe!' : 'Needs Reinforcement!';
}
```