https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

## Python
```py
import string

def valueNb(s):
    l = list(string.ascii_lowercase)
    somme = 0
    for i in range(len(s)):
        somme += l.index(s[i]) + 1
    return somme

def high(x):
    x = x.split(" ")
    w = ''
    maxi = 0
    for i in x:
        if valueNb(i)>maxi:
            maxi = valueNb(i)
            w = i
    return w
```