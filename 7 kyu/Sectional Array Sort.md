https://www.codewars.com/kata/58ef87dc4db9b24c6c000092

## Python
```py
def sect_sort(*args):
    if len(args) == 2:
        t1 = args[0][:args[1]]
        t2 = args[0][args[1]:]
        t2.sort()
        return t1+t2
    else:
        t1 = args[0][:args[1]]
        if args[2] == 0:
            t2 = args[0][args[1]:]
            t3 = []
        else:
            t2 = args[0][args[1]:args[1]+args[2]]
            t3 = args[0][args[1]+args[2]:]
        t2.sort()
        return t1+t2+t3
```