https://www.codewars.com/kata/57f59da8d3978bb31f000152

## JavaScript
```js
function makeMeSlow() {
  const start = Date.now();
  const duration = 7000

  while (Date.now() - start < duration) {}
  
  console.log("Enfin terminé après 7 secondes !");
}
```

## Python
```py
import time

def make_me_slow():
    time.sleep(7)
```

## PHP
```php
function makeMeSlow() {
  sleep(7);
}
```

## Java
```java
public class Kata {
  public static void makeMeSlow() {
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
  }
}
```