https://www.codewars.com/kata/555086d53eac039a2a000083

## Python
```python
def lovefunc( flower1, flower2 ):
    return (flower1 + flower2)%2
```

## PHP
```php
function lovefunc($flower1, $flower2) {
  return ($flower1 + $flower2)%2 == 1;
}
```

## JavaScript
```js
function lovefunc(flower1, flower2){
  return (flower1 + flower2)%2 == 1;
}
```

## Java
```java
public class OppositesAttract {
  public static boolean isLove(final int flower1, final int flower2) {
    return (flower1 + flower2)%2 == 1;
  }
}
```

## SQL
```sql
-- # write your SQL statement here: you are given a table 'love' with columns 'flower1' and 'flower2', return a table with columns ('flower1' and 'flower2') and your result in a column named 'res'.
SELECT flower1, flower2,MOD(flower1+flower2, 2) > 0 AS res FROM love
```