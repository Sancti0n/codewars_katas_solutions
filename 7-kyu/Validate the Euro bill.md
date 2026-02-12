https://www.codewars.com/kata/67fb86b6564f0bd70dc615b1

## Python
```py
import string

def validate_euro(serial_number):
    t, s = list(string.ascii_uppercase), 0
    for i in serial_number:
        if i.isdigit(): s += int(i)
        else: s += t.index(i)+1
    while s>9:
        s = sum([int(i) for i in str(s)])
    return s == 7
```