https://www.codewars.com/kata/560a4962c0cc5c2a16000068

## Python
```python
def eq_sum_powdig(hMax, exp):
    t = []
    for i in range(2, hMax+1):
        res = [int(x) for x in str(i)]
        if i == sum(list(map(lambda x: x**exp, res))): t.append(i)
    return t
```