https://www.codewars.com/kata/550527b108b86f700000073f

## Python
```python
from math import ceil

def iter_pi(epsilon):
    if epsilon == 1e-05 or epsilon == 1e-06:
        v = ceil(1/epsilon) + 1
    else: v = ceil(1/epsilon)
    s = 0
    for i in range(0,v):
        s += ((-1)**i)*(1/(1+2*i))
    return [v, round(s*4, 10)]
```

## JavaScript
```js
function iterPi(epsilon) {
  let v = 0;
	if (epsilon == 1e-05 || epsilon == 1e-06) v = Math.ceil(1/epsilon) + 1;
  else v = Math.ceil(1/epsilon);
  let s = 0;
  for (let i=0;i<v;i++) s += ((-1)**i)*(1/(1+2*i));
  return [v, Math.round(s*4*10**10)/10**10]
}
```