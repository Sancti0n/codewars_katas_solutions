https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

## Python
```py
def sort_array(arr):
    t = []
    temp = []
    for i in arr:
        if i%2 == 0: t.append(i)
        else:
            t.append('')
            temp.append(i)
    temp.sort()
    c = 0
    for i in range(len(t)):
        if t[i] == '':
            t[i] = temp[c]
            c += 1
    return t
```