https://www.codewars.com/kata/614dfc4ce78d31004a9c1276

## Python
```py
def ohms_law(s):
    s = s.split(' ')
    V, I, R = 0, 0, 0
    for i in s:
        if 'V' in i: V = i.split('V')[0]
        if 'A' in i: I = i.split('A')[0]
        if 'R' in i: R = i.split('R')[0]
    if V != 0 and I != 0: return str(round(float(V)/float(I), 6)) +'R'
    if V != 0 and R != 0: return str(round(float(V)/float(R), 6)) +'A'
    if R != 0 and I != 0: return str(round(float(R)*float(I), 6)) +'V'
```