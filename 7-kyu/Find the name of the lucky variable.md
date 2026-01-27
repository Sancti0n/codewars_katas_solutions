https://www.codewars.com/kata/5a47d5ddd8e145ff6200004e

## Python
```py
import gc

def find_variable():
    cible = 777
    for obj in gc.get_objects():
        if isinstance(obj, dict):
            for nom, val in obj.items():
                if val == cible:
                    return nom
```