https://www.codewars.com/kata/558fa34727c2d274c10000ae

## Python
```python
def scrabble_score(st):
    d = {"a":1, "b":3, "c":3, "d":2, "e":1, "f":4, "g":2, "h":4, "i":1, "j":8, "k":5, "l":1, "m":3,
         "n":1, "o":1, "p":3, "q":10, "r":1, "s":1, "t":1, "u":1, "v":4, "w":4, "x":8, "y":4, "z":10}
    s = 0
    for i in st.lower():
        if i in d: s += d[i]
    return s
```

## JavaScript
```js
function scrabbleScore(str) {
    let obj = {"a":1, "b":3, "c":3, "d":2, "e":1, "f":4, "g":2, "h":4, "i":1, "j":8, "k":5, "l":1, "m":3, "n":1, "o":1, "p":3, "q":10, "r":1, "s":1, "t":1, "u":1, "v":4, "w":4, "x":8, "y":4, "z":10};
    let s = 0;
    str = str.toLowerCase();
    for (let i=0;i<str.length;i++) {
        if (Object.keys(obj).indexOf(str[i])>-1) s += obj[str[i]];
    }
    return s
}
```