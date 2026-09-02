https://www.codewars.com/kata/5b45e4b3f41dd36bf9000090

## Python
```py
def sequence(x):
    t = list(range(1,x+1))
    for i in range(len(t)):
        t[i] = str(t[i])
    t = sorted(t)
    for i in range(len(t)):
        t[i] = int(t[i])
    return t
```