https://www.codewars.com/kata/6582206efbfb3a604cb0a6fe

## Python
```py
def fix_code(isbn):
    s, p = 0, 0
    for i in range(len(isbn)):
        if isbn[i] != "?":
            if isbn[i] == "X":
                s += (10-i)*10
            else:
                s += (10-i)*int(isbn[i])
        else:
            p = i
    c = 10
    while (s + (10-p)*c)%11 != 0:
        c -= 1
    return "X" if c > 9 else str(c)
```