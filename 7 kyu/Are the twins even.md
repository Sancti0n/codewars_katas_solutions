https://www.codewars.com/kata/5a9da7d07ce110fea1000638

## Python
```python
def even_twins(numbers):
    t = []
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[i]+numbers[j] not in t: t.append(numbers[i]+numbers[j])
    return len([i for i in t if i%2 == 0])
```