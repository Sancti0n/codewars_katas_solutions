https://www.codewars.com/kata/5977ef1f945d45158d00011f

## Python
```py
def sep_str(st):
    s = st.split(' ')
    maxi = 0
    for i in s:
        if len(i)>maxi: maxi = len(i)
    i = 0
    while i<len(s):
        while len(s[i])<maxi: s[i] += ' '
        i += 1
    t = []
    t1 = []
    for j in range(0, maxi):
        for i in range(len(s)): t.append(s[i][j])
        for a in range(len(t)):
            if t[a] == ' ': t[a] = ''
        t1.append(t)
        t = []
    return t1
```