https://www.codewars.com/kata/56ec6016a9dfe3346e001242

## Python
```py
import math

def geometric_meanII(arr):
    total_entries = len(arr)
    valid_numbers = []
    invalid_count = 0
    
    for x in arr:
        if isinstance(x, (int, float)) and x >= 0:
            valid_numbers.append(x)
        else:
            invalid_count += 1

    if 2 <= total_entries <= 10:
        if invalid_count > 1: return 0
    elif total_entries > 10:
        if invalid_count > (total_entries * 0.1): return 0
    else:
        if invalid_count > 0: return 0

    if not valid_numbers: return 0

    try:
        sum_logs = sum(math.log10(x) for x in valid_numbers)
        return 10 ** (sum_logs / len(valid_numbers))
    except ValueError: return 0
```