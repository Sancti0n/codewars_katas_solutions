https://www.codewars.com/kata/586ee462d0982081bf001f07

## Python
```python
def fillable(stock, merch, n):
    if merch in stock: return stock[merch]>=n
    return False
```