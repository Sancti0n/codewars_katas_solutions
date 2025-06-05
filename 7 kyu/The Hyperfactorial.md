https://www.codewars.com/kata/6324786fcc1a9700260a2147

## Python
```python
def hyperfact(num):
    i,m = 1,1
    while i<=num:
        m = (m*(i**i))%1000000007
        i += 1
    return m
```