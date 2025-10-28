https://www.codewars.com/kata/56170e844da7c6f647000063

## Python
```python
def people_with_age_drink(age):
    if age<14: return "drink toddy"
    elif age<18: return "drink coke"
    elif age<21: return "drink beer"
    return "drink whisky"
```

## JavaScript
```js
function peopleWithAgeDrink(age) {
  if (age<14) return "drink toddy"
  else if (age<18) return "drink coke"
  else if (age<21) return "drink beer"
  return "drink whisky"
};
```

## PHP
```php
function people_with_age_drink(int $age): string {
  if ($age<14) return "drink toddy";
  else if ($age<18) return "drink coke";
  else if ($age<21) return "drink beer";
  return "drink whisky";
}
```