https://www.codewars.com/kata/5806445c3f1f9c2f72000031

## Python
```python
def mean_vs_median(numbers):
    mean = sum(numbers)/len(numbers)
    median = sorted(numbers)[int(len(numbers)/2)]
    return 'same' if mean == median else 'mean' if mean > median else 'median'
```