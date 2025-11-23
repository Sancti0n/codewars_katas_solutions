https://www.codewars.com/kata/56a5d994ac971f1ac500003e

## Python
```py
def longest_consec(arr, k):
    if len(arr) == 0 or k<1 or k>len(arr): return ''
    t = []
    t1 = []
    maxi = 0
    for i in range(len(arr)):
        a, b, w = 0, i, ''
        while a<k and b<len(arr):
            w += arr[b]
            a += 1
            b += 1
        t.append(w)
    t = arr + t
    t.sort(key=len)
    for i in range(len(t)):
        if len(t[i]) > maxi: t1.append(t[i])
    t1.sort(key=len, reverse= True)
    return t1[0]
```