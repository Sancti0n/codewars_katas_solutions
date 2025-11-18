https://www.codewars.com/kata/590148d79097384be600001e

## Python
```py
def sort_by_guide(arr, guide):
    t = []
    temp = list(range(1, len(arr) - guide.count(-1) + 1))
    for i in range(len(arr)):
        if guide[i]<0: t.append(arr[i])
        else: 
            temp[guide[i]-1] = arr[i]
            t.append("")
    i, a = 0, 0
    while i<len(t):
        if t[i] == "":
            t[i] = temp[a]
            a += 1
        i += 1
    return t
```