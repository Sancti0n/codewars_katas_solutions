https://www.codewars.com/kata/5434283682b0fdb0420000e6

## Python
```python
def caffeine_buzz(n):
    if n%3 == 0 and n%4 == 0:
        return "Coffee" if n%2 else "CoffeeScript"
    if n%3 == 0:
        return "Java" if n%2 else "JavaScript"
    return "mocha_missing!"
```

## JavaScript
```js
function caffeineBuzz(n){
  if (n%3 == 0 && n%4 == 0) return n%2 ? "Coffee": "CoffeeScript"
  if (n%3 == 0) return n%2 ? "Java": "JavaScript"
  return "mocha_missing!"
}
```