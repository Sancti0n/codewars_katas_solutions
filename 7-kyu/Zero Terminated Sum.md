https://www.codewars.com/kata/5a2d70a6f28b821ab4000004

## Python
```python
def largest_sum(s):
    s = s.split("0")
    s.remove("")
    return max([sum(list(map(int, list(x)))) for x in s])
```