https://www.codewars.com/kata/57a73e697cb1f31dd70000d2

## Python
```python
from preloaded import animals, elements

def chinese_zodiac(year):
    return str(elements[(int((year-1924)/2))%5]) + " " + str(animals[(year - 1924)%12])
```