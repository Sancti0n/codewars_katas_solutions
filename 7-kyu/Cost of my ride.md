https://www.codewars.com/kata/586430a5b3a675296a000395

## JavaScript
```js
function insurance(age, size, numofdays) {
  if (numofdays<=0) return 0
  let s = 0, cSize = {"economy":0, "medium":10, "full-size": 15};
  if (!(size in cSize)) size = "full-size";
  if (age<25) s += 10*numofdays;
  s += numofdays*(cSize[size] + 50);
  return s
}
```

## Python
```py
def insurance(age, size, num_of_days):
    Age = 10 if age < 25 else 0
    Size = 0 if size == "economy" else 10 if size == "medium" else 15
    return 0 if num_of_days <= 0 else (50 + Age + Size)*num_of_days
```