https://www.codewars.com/kata/55f73be6e12baaa5900000d4

## Python
```python
def goals(laLiga, copaDelRey, championsLeague):
    return sum([laLiga, copaDelRey, championsLeague])
```

## PHP
```php
function goals (int $laLigaGoals, int $copaDelReyGoals, int $championsLeagueGoals) : int {
  return array_sum([$laLigaGoals, $copaDelReyGoals, $championsLeagueGoals]);
}
```

## JavaScript
```js
function goals (...arr) {
  return arr.reduce((previousValue, currentValue) => previousValue + currentValue, 0)
}
```

## Java
```java
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals+copaDelReyGoals+championsLeagueGoals;
    }
}
```