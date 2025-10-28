https://www.codewars.com/kata/587731fda577b3d1b0001196

## Python
```python
def camel_case(s):
    t = s.split(" ")
    for i in range(len(t)):
        if t[i] != "": t[i] = t[i][0].upper() + t[i][1:]
    return "".join(t)
```

## JavaScript
```js
String.prototype.camelCase=function(){
  let t = this.split(" ");
  for (let i=0;i<t.length;i++) {
    if (t[i] != "") t[i] = t[i][0].toUpperCase() + t[i].substring(1);
  }
  return t.join("")
}
```

## PHP
```php
function camel_case(string $s): string {
  return str_replace(' ', '', ucwords($s));
}
```