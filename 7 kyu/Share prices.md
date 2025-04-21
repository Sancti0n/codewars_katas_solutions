https://www.codewars.com/kata/5603a4dd3d96ef798f000068

## Python
```python
def share_price(invested, changes):
    s = float(invested)
    for i in changes:
        s = s*(1 + i/100)
    s = str(round(s, 2))
    return s + "0" if len(s.split(".")[1])<2 else s
```