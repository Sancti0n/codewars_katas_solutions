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

## JavaScript
```js
function pizzaRewards(customers, minOrders, minPrice) {
  let t = [], c = 0;
  for (let i in customers) {
    for (let j=0;j<customers[i].length;j++) {
      if (customers[i][j]>=minPrice) c++;
    }
    if (c>=minOrders) t.push(i);
    c = 0;
  }
  return t
}
```