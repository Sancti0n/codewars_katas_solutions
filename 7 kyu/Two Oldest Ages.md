https://www.codewars.com/kata/511f11d355fe575d2c000001

## Python
```python
def two_oldest_ages(ages):
    ages.sort()
    return [ages[-2], ages[-1]]
```

## JavaScript
```js
function twoOldestAges(ages) {
  ages.sort((a,b)=>b-a);
  return [ages[1], ages[0]]
}
```