https://www.codewars.com/kata/5c744111cb0cdd3206f96665

## Python
```py
def solution(to_cur,value):
    if to_cur == "USD":
        return ["${:,.2f}".format(i*1.1363636) for i in value]
    if to_cur == "EUR":
        return ["{:,.2f}€".format(i/1.1363636) for i in value]
```