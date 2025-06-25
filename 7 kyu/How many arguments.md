https://www.codewars.com/kata/5c44b0b200ce187106452139

## Python
```python
def args_count(*arg,**a):
    return len(arg)+len(a)
```

## JavaScript
```js
function args_count(...a) {
  return a.length
}
```

## PHP
```php
function args_count(...$a) {
  return count($a);
}
```

## Java
```java
class Arguments {
    public static int countArgs(Object... args) {
        return args.length;
	}
}
```