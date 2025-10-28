https://www.codewars.com/kata/57f12b4d5f2f22651c00256d

## Python
```py
def array_info(x):
    t = [0]*5
    t[0] = len(x)
    for i in range(len(x)):
        if isinstance(x[i], int): t[1] += 1
        elif isinstance(x[i], float): t[2] += 1
        elif isinstance(x[i], str) and x[i] != " ": t[3] += 1
        elif x[i] == " ": t[4] += 1
    if sum(t) == 0: return 'Nothing in the array!'
    for j in range(len(t)):
        if t[j] == 0: t[j] = [None]
        else: t[j] = [t[j]]
    return t
```