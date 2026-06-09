https://www.codewars.com/kata/5a147735ffe75f1c75000199

## Python
```py
import time

def increment_loop(n):
    if n <= 0:
        return 0
    i = 0
    stop_time = time.perf_counter() + n
    while time.perf_counter() < stop_time:
        i += 1
    return i
```