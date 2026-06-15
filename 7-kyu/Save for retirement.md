https://www.codewars.com/kata/58177df1e7f457b89d000327

## JavaScript
```js
function getYears(deposit, target, rate) {
  let balance = 0, years = 0;
  let multiplier = 1 + rate/100;

  while (balance < target) {
    years++;
    balance += deposit;
    balance *= multiplier;
  }
  return years
}

function calculateRetirement(deposit, target) {
  let result = {};
  for (let r = 1; r <= 6; r++) {
    result[r] = getYears(deposit, target, r);
  }
  return result
}
```

## Python
```py
def getYears(deposit, target, rate):
    balance, years = 0, 0
    multiplier = 1 + rate/100
    
    while (balance<target):
        years += 1
        balance += deposit
        balance *= multiplier
    return years

def calculate_retirement(deposit, target):
    result = {}
    for r in range(7):
        result[r] = getYears(deposit, target, r)
    return result
```