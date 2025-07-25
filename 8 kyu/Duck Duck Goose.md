https://www.codewars.com/kata/582e0e592029ea10530009ce

## Python
```python
def duck_duck_goose(players, goose):
    return players[((goose%len(players))-1)].name
```

## PHP
```php
function duck_duck_goose($players, $goose) {
  return $players[($goose-1)%count($players)]["name"];
}
```

## JavaScript
```js
function duckDuckGoose(players, goose) {
  return players[(goose-1)%players.length].name
}
```

## Java
```java
public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    return players[(goose-1)%players.length].name;
  }
}
```