https://www.codewars.com/kata/5761a717780f8950ce001473

## JavaScript
```js
function  calculateAge(y1, y2) {
  if (y1<y2) {
    if (Math.abs(y1-y2) == 1) return "You are "+(y2-y1)+" year old."
    return "You are "+(y2-y1)+" years old."
  }
  if (y1>y2) {
    if (y1-y2 == 1) return "You will be born in "+(y1-y2)+" year."
    return "You will be born in "+(y1-y2)+" years."
  }
  return "You were born this very year!"
}
```

## Python
```python
def calculate_age(year_of_birth, current_year):
    if year_of_birth<current_year:
        if abs(year_of_birth-current_year) == 1: return "You are "+str(current_year-year_of_birth)+" year old."
        return "You are "+str(current_year-year_of_birth)+" years old."
    if year_of_birth>current_year: 
        if year_of_birth-current_year == 1: return "You will be born in "+str(year_of_birth-current_year)+" year."
        return "You will be born in "+str(year_of_birth-current_year)+" years."
    return "You were born this very year!"
```

## Java
```java
public class AgeDiff {
    public static String CalculateAge(int y1, int y2) {
        if (y1<y2) {
            if (Math.abs(y1-y2) == 1) return "You are "+(y2-y1)+" year old.";
            return "You are "+(y2-y1)+" years old.";
        }
        if (y1>y2) {
            if (y1-y2 == 1) return "You will be born in "+(y1-y2)+" year.";
            return "You will be born in "+(y1-y2)+" years.";
        }
        return "You were born this very year!";
    }
}
```