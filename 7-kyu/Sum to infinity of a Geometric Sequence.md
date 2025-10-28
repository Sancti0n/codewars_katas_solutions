https://www.codewars.com/kata/589b137753a9a4ab5700009a

## Python
```py
def sum_to_infinity(s):
    if s[1]/s[0] >= 1 or s[1]/s[0] < -1 or sum(s) == 0: return 'No Solutions'
    return round(s[0]/(1-s[1]/s[0]), 3)
```