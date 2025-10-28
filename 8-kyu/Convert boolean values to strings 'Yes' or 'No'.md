https://www.codewars.com/kata/53369039d7ab3ac506000467

## Python
```python
def bool_to_word(boolean):
    if boolean: return 'Yes'
    return 'No'
```

## PHP
```php
function boolToWord($bool){
  return $bool ? "Yes" : "No";
}
```

## JavaScript
```js
function boolToWord(bool){
  if (bool) return 'Yes'
  return 'No'
}
```

## Java
```java
class YesOrNo {
  public static String boolToWord(boolean b) {
    return b ? "Yes" : "No";
  }
}
```

## SQL
```sql
-- # write your SQL statement here: you are given a table 'booltoword' with column 'bool', return a table with column 'bool' and your result in a column named 'res'.
SELECT bool,
  CASE
    WHEN bool = true THEN 'Yes'
    ELSE 'No'
  END
AS res FROM booltoword
```

## TypeScript
```ts
export const boolToWord = (bool: boolean): string => {
  return bool ? "Yes" : "No";
};
```