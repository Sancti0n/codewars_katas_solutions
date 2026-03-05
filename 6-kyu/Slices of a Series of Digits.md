https://www.codewars.com/kata/53f9a36864b19d8be7000609

## Python
```py
def series_slices(digits, n):
    if n>len(digits): raise Exception()
    t = []
    for i in range(len(digits)):
        temp = []
        s = digits[i:n+i]
        if len(s)<n:
            return t
        for j in s:
            temp.append(int(j))
        t.append(temp)
    return t
```