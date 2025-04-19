https://www.codewars.com/kata/595910299197d929a10005ae

## Python
```python
def pizza_rewards(customers, min_orders, min_price):
    t = []
    for i in customers:
        if len(list(filter(lambda x: x>= min_price, customers[i]))) >= min_orders:
            t.append(i)
    return t
```