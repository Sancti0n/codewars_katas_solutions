https://www.codewars.com/kata/57eae20f5500ad98e50002c5

## TypeScript
```ts
export function noSpace(x:string):string {
  return x.split(" ").join("")
}
```

## Python
```python
def no_space(x):
    return "".join(x.split(' '))}
```

## Java
```java
public class Kata {
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
```

## JavaScript
```js
function noSpace(p) {
  return p.split(" ").join("")
}
```

## PHP
```php
function no_space(string $s): string {
  return implode("", explode(" ", $s));
}
```