https://www.codewars.com/kata/55c45be3b2079eccff00010f

## Python
```py
def order(sentence):
    if len(sentence) == 0: return ""
    s = sentence.split(" ")
    t = list(range(len(s)))
    print(t)
    i = 0
    while i<len(s):
        j = 1
        while str(j) not in s[i]:
            j += 1
        t[j-1] = s[i]
        i += 1
    return " ".join(t)
```