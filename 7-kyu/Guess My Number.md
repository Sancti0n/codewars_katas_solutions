https://www.codewars.com/kata/5654d2428be803670a000030

## Python
```py
def guess_my_number(guess, number = '123-451-2345'):
    s = ""
    for i in number:
        if i in guess: s += i
        else:
            if i == "-": s += "-"
            else: s += "#"
    return s
```