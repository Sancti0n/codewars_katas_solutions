https://www.codewars.com/kata/585d7b4685151614190001fd

## Python
```py
def get_total(costs, items, tax):
    s = 0
    for i in items:
        if i in costs: s += costs[i]
    return round(s*(1+tax), 2)
```