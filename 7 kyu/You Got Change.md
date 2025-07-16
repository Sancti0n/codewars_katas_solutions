https://www.codewars.com/kata/5966f6343c0702d1dc00004c

## Python
```python
def give_change(amount): 
    t = []
    s = 0
    while amount >= 100:
        amount -= 100
        s += 1
    t.append(s)
    s = 0
    while amount >= 50:
        amount -= 50
        s += 1
    t.append(s)
    s = 0
    while amount >= 20:
        amount -= 20
        s += 1
    t.append(s)
    s = 0
    while amount >= 10:
        amount -= 10
        s += 1
    t.append(s)
    s = 0
    while amount >= 5:
        amount -= 5
        s += 1
    t.append(s)
    s = 0
    while amount >= 1:
        amount -= 1
        s += 1
    t.append(s)
    t.reverse()
    return tuple(t)
```