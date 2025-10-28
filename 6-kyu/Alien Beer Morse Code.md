https://www.codewars.com/kata/56dc4f570a10feaf0a000850

## Python
```python
import re

def morse_converter(s):
    d = {".----": 1, "..---": 2, "...--": 3, "....-": 4, ".....": 5, "-....": 6, "--...": 7, "---..": 8, "----.": 9, "-----": 0}
    t = re.findall('.....', s)
    w = ""
    for i in t: w += str(d[i])
    return int(w)
```