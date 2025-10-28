https://www.codewars.com/kata/52b757663a95b11b3d00062d

## Python
```py
def to_weird_case(string):
    w = ''
    s = string.split(' ')
    for i in range(len(s)):
        for j in range(len(s[i])):
            if j%2 == 0: w += s[i][j].upper()
            else: w += s[i][j]
        w += ' '
    return w[:-1]
```