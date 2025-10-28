https://www.codewars.com/kata/5545f109004975ea66000086

## Python
```python
def is_divisible(n,x,y):
    return n%x == 0 and n%y == 0
```

## PHP
```php
function is_divisible($n, $x, $y) {
  return $n%$x == 0 and $n%$y == 0;
}
```

## JavaScript
```js
function isDivisible(n, x, y) {
  return n%x == 0 && n%y == 0
}
```

## Dart
```dart
bool isDivisible(int n, int x, int y) {
  return n%x == 0 && n%y == 0;
}
```

## Java
```java
public class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
		return n%x == 0 && n%y == 0;
	}
}
```

## D
```d
module solution;

export bool isDivisible(uint n, uint a, uint b) {
    return n%a == 0 && n%b == 0;
}
```

## SQL
```sql
-- You will be given a table 'kata' with columns 'id', 'n', 'x', and 'y'. 
-- Return the 'id' and your result in a column named 'res' using a SELECT statement.
-- You DON'T need to create a function, that's for other languages.
select id,MOD(n,x)=0 AND MOD(n,y)=0 AS res from kata
```