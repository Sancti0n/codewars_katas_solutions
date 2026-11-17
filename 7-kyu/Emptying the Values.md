https://www.codewars.com/kata/650017e142964e000f19cac3

## Python
```py
def empty_values(lst):
    return [type(x)() if x is not None else None for x in lst]
```