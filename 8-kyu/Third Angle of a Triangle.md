https://www.codewars.com/kata/5a023c426975981341000014

## Python
```python
def other_angle(a, b):
    return 180 - a - b
```

## JavaScript
```js
function otherAngle(a, b) {
  return 180 - a - b
}
```

## PHP
```php
function otherAngle($a, $b) {
  return 180-$a-$b;
}
```

## Java
```java
public class ThirdAngle {
  public static int otherAngle(int angle1, int angle2) {
    return 180-angle1-angle2;
  }
}
```

## SQL
```sql
--# write your SQL statement here: 
-- you are given a table 'otherangle' with columns 'a' and 'b'.
-- return a table with these columns and your result in a column named 'res'.
SELECT a,b,180-a-b AS res FROM otherangle
```

## TypeScript
```ts
export const otherAngle = (a: number, b: number): number => {
  return 180 - a - b
}
```

## Ruby
```ruby
def other_angle(a, b)
  return 180 - a - b
end
```

## Rust
```rust
fn other_angle(a: u32, b: u32) -> u32 {
    return 180 - a - b
}
```

## Dart
```dart
int otherAngle(int a, int b) {
  return 180 - a - b;
}
```

## C#
```c#
public static class Kata {
  public static int OtherAngle(int a, int b) {
    return 180 - a - b;
  }
}
```

## C++
```c++
class Triangle {

public:

    static int otherAngle(int a, int b) {
        return 180 - a - b;
    }
};
```

## C
```c
int other_angle(int a, int b) {
  return 180 - a - b;
}
```