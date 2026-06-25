https://www.codewars.com/kata/679e3754cb041c0685865dde

## Python
```py
def who_is_serving(current_round: int) -> int:
    n = current_round%4
    return 1 if n in [1,2] else 2
```