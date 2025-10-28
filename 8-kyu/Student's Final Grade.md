https://www.codewars.com/kata/5ad0d8356165e63c140014d4

## Python
```python
def final_grade(exam, projects):
    if exam > 90 or projects > 10: return 100
    if exam > 75 and projects >= 5: return 90
    if exam > 50 and projects >= 2: return 75
    return 0
```

## JavaScript
```js
function finalGrade (exam, projects) {
  if (exam > 90 || projects > 10) return 100
  if (exam > 75 && projects >= 5) return 90
  if (exam > 50 && projects >= 2) return 75
  return 0
}
```

## PHP
```php
function finalGrade($exam, $projects) {
  if ($exam > 90 || $projects > 10) return 100;
  if ($exam > 75 && $projects >= 5) return 90;
  if ($exam > 50 && $projects >= 2) return 75;
  return 0;
}
```