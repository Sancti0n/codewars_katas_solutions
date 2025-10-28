https://www.codewars.com/kata/53dc23c68a0c93699800041d

## TypeScript
```ts
export function smash (words: string[]): string {
   return words.join(' ')
};
```

## Java
```java
import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    return String.join(" ", words);
  }
}
```

## Python
```python
def smash(words):
    return " ".join(words)
```

## JavaScript
```js
function smash (words) {
   return words.join(' ')
}
```

## PHP
```php
function smash(array $words): string {
  return implode(" ", $words);
}
```