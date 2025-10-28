https://www.codewars.com/kata/5a4e3782880385ba68000018

## Python
```python
import math

def balanced_num(number):
    if number<100: return "Balanced"
    l = len(str(number))/2
    c = "Balanced"
    if l != int(l):
        return c if sum(list(map(int, str(number)[:int(l)]))) == sum(list(map(int, str(number)[math.ceil(l):]))) else "Not " + c
    return c if sum(list(map(int, str(number)[:int(l)-1]))) == sum(list(map(int, str(number)[int(l)+1:]))) else "Not " + c
```