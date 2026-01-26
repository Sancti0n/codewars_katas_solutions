https://www.codewars.com/kata/557d9e4d155e2dbf050000aa

## Python
```py
class UniversalTruth:
    def __eq__(self, other): return True  # ==
    def __ne__(self, other): return True  # !=
    def __lt__(self, other): return True  # <
    def __le__(self, other): return True  # <=
    def __gt__(self, other): return True  # >
    def __ge__(self, other): return True  # >=

def anything(thing):
    return UniversalTruth()
```