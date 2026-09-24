https://www.codewars.com/kata/590fca79b5f8a69285000465

## JavaScript
```js
function applesDistribution(apples, boxCapacity, maxResidue) {
  let count = 0;
  for (let N = boxCapacity; N >= 1; N--) {
    if (apples % N <= maxResidue) {
      count++;
    }
  }
  return count;
}
```

## Python
```py
def apples_distribution(apples, capacity, max_left):
    c = 0
    for i in range(1, capacity+1):
        if apples % i <= max_left:
            c += 1
    return c
```