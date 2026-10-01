https://www.codewars.com/kata/624e0a4c3e1d7b0031588666

## Python
```py
def recurrence(values):
    c = 0
    m = values.index(min(values))
    for i in range(m + 1, len(values)):
        if values[i-1] < values[i]:
            c += 1
            if c > 2:
                return True
        else:
            c = 0
    return False
```