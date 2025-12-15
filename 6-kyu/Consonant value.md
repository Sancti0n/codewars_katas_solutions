https://www.codewars.com/kata/59c633e7dcc4053512000073

## Python
```py
import string

def solve(s):
    t = [0]
    i, c = [0, 0]
    v = "aeiou"
    alpha = list(string.ascii_lowercase)
    while i<len(s):
        while s[i] in v and i+1<len(s):
            i += 1
            t.append(0)
            c += 1
        t[c] += alpha.index(s[i]) + 1
        i += 1
    return max(t)
```