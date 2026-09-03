https://www.codewars.com/kata/66c9186bb01defccbd40449d

## Python
```py
def gould():
    n = 0
    while True:
        yield n.bit_count()
        n += 1
```

## JavaScript
```js
function* gould() {
  let n = 0;
  while (true) {
    const bitCount = n.toString(2).split('1').length - 1;
    yield bitCount;
    n++;
  }
}
```