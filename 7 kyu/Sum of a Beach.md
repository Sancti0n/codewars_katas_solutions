https://www.codewars.com/kata/5b37a50642b27ebf2e000010

## Python
```python
def sum_of_a_beach(beach):
    s = beach.lower()
    t = ["sand", "water", "fish", "sun"]
    c = 0
    for i in t:
        if i in s: c += s.count(i)
    return c
```