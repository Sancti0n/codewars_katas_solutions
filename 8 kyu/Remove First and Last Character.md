https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0

## TypeScript
```ts
export function removeChar(str: string): string {
  return str.substring(1, str.length-1)
}
```

## Python
```python
def remove_char(s):
    return s[1:-1]
```

## PHP
```php
function remove_char(string $s): string {
  return substr($s, 1, strlen($s)-2);
}
```

## JavaScript
```js
function removeChar(str){
  return str.substring(1, str.length-1)
};
```

## Java
```java
public class RemoveChars {
  public static String remove(String str) {
    return str.substring(1,str.length()-1);
  }
}
```

## SQL
```sql
SELECT s, Substring(s, 2, LENGTH(s)-2) as res FROM removechar
```