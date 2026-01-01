https://www.codewars.com/kata/54a91a4883a7de5d7800009c

## Python
```py
def increment_string(string):
    if string == "": return '1'
    if string.isnumeric(): 
        l = len(string)
        n = str(int(string)+1)
        while len(n)<l: n = '0' + n
        return n
    if string[-1].isnumeric():
        i = len(string)-1
        while string[i].isnumeric(): i -= 1
        s = string[:i+1]
        n = str(string[i+1:])
        l = len(n)
        n = str(abs(int(n))+1)
        while len(n)<l: n = '0' + n
        return s+n
    else: return string+'1'
```