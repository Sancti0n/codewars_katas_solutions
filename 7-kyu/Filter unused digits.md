https://www.codewars.com/kata/55de6173a8fbe814ee000061

## Python
```py
def unused_digits(*args):
    t = list(range(10))
    w = ''
    for i in args:
        for a in str(i):
            if int(a) in t: 
                t.remove(int(a))
    for i in t:
        w += str(i)
    return w
```