https://www.codewars.com/kata/6656a4687f3e4eb5fb520817

## JavaScript
```js
const evenOrOdd = new Proxy(n => n%2 ? 'Odd' : 'Even', {
  get: (target, prop) => {
    if (!isNaN(prop)) return target(Number(prop));
    return target[prop];
  }
});
```

## Python
```py
class EvenOrOdd:
    def __call__(self, n) :
        return "Odd" if n%2 else "Even"
    def __getitem__(self, n):
        return self(n)

even_or_odd = EvenOrOdd()
```