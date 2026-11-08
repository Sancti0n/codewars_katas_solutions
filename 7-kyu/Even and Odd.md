https://www.codewars.com/kata/594adadee075005308000122

## Python
```py
def even_and_odd(n):
    s = str(n)
    NE = ''
    NO = ''
    for i in range(len(s)):
        if int(s[i])%2 == 0: NE += s[i]
        else: NO += s[i]
    if NE == '': NE = 0
    if NO == '': NO = 0
    return int(NE), int(NO)
```