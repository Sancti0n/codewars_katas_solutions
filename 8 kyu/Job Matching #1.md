https://www.codewars.com/kata/56c22c5ae8b139416c00175d

## JavaScript
```js
function match(candidate, job) {
  if (Object.keys(candidate).length == 0 || Object.keys(job).length == 0) {
    throw new Error("error");
  }
  return candidate['minSalary']*0.9 <= job['maxSalary']
}
```

## Python
```python
def match(candidate, job):
    if candidate["min_salary"]>job["max_salary"]:
        if candidate["min_salary"]*0.9<=job["max_salary"]:
            return True
        return False
    return True
```