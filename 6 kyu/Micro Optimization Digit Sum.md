https://www.codewars.com/kata/59a2af923203e8220b00008f

## Python
```python
def digit_sum(n):
    s = str(n)
    sum = 0
    for i in s:
        sum += int(i)
    return sum
```