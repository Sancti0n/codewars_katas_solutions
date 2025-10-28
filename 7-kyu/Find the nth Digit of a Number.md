https://www.codewars.com/kata/577b9960df78c19bca00007e

## Python
```py
def find_digit(num, nth):
    num =  str(num)[::-1]
    l = len(num)
    if nth>l: return 0
    if nth<1: return -1
    return int(num[nth-1])
```