https://www.codewars.com/kata/58a5aeb893b79949eb0000f1

## Python
```python
def shared_bits(a, b):
    a = "{0:b}".format(a)
    b = "{0:b}".format(b)
    a = a.rjust(max(len(a),len(b)), '0')
    b = b.rjust(max(len(a),len(b)), '0')
    c = 0
    for i in range(len(a)):
        if int(a[i])+int(b[i]) == 2: c += 1
        if c>1: return True
    return False
```