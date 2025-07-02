https://www.codewars.com/kata/57e3f79c9cb119374600046b

## TypeScript
```ts
export function hello(name = ''): string {
  if (name == '') name = "World";
  else name = name.toLowerCase();
  return "Hello, "+name.charAt(0).toUpperCase() + name.slice(1)+"!"
}
```

## Python
```python
def hello(*args):
    if len(args) == 0 or args[0] == '': name = "World"
    else: name = args[0]
    return "Hello, "+name.lower().capitalize()+"!"
```

## JavaScript
```js
function hello(...name) {
  if (name.length == 0 || name[0] == "") name = "World"
  else name = name[0].toLowerCase();
  return "Hello, "+name.charAt(0).toUpperCase() + name.slice(1)+"!"
}
```

## PHP
```php
function hello($name = ''): string {
  if (strlen($name) == 0 || $name[0] == "") $name = "World";
  else ($name = strtolower($name));
  return "Hello, ".strtoupper($name[0]).substr($name, 1)."!";
}
```