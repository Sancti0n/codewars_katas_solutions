https://www.codewars.com/kata/586c1cf4b98de0399300001d

## Python
```python
def combat(health, damage):
    if damage>health: return 0
    return health-damage
```

## PHP
```php
function combat($health, $damage) {
  return max(0, $health-$damage);
}
```

## JavaScript
```js
function combat(health, damage) {
  return Math.max(0, health-damage)
}
```

## Java
```java
public class Game {
    public static int combat(int health, int damage) {
        return Math.max(0, health-damage);
    }
}
```