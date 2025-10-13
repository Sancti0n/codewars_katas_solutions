https://www.codewars.com/kata/55606aeebf1f0305f900006f

## Python
```py
def to_binary(n):
    if n<0: 
        a = list(("{:032b}".format(~n)))
        i = 0
        while i<len(a):
            a[i] = str((int(a[i]) + 1)%2)
            i += 1
        return "".join(a)
    return "{0:b}".format(n)
```