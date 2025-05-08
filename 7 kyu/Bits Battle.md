https://www.codewars.com/kata/58856a06760b85c4e6000055

## Python
```python
def bits_battle(numbers):
    t = [0,0]
    for i in numbers:
        if i%2: t[1] += "{0:b}".format(i).count("1")
        elif i%2 == 0 and i !=0: t[0] += "{0:b}".format(i).count("0")
    return 'odds win' if t[1]>t[0] else 'evens win' if t[1]<t[0] else 'tie'
```