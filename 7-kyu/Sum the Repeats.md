https://www.codewars.com/kata/56b4bae128644b5613000037

## Python
```py
def repeat_sum(l):
    d = {}
    somme = 0
    for i in l:
        s = list(set(i))
        for k in s:
            if k in d:
                d[k] += 1
            if k not in d:
                d[k] = 1
            if d[k] == 2:
                somme += k
    return somme
```