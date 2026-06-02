https://www.codewars.com/kata/57ab2d6072292dbf7c000039

## JavaScript
```js
function correctPolishLetters (string) {
  let d = {
    "ą":"a", "ć":"c", "ę":"e", "ł":"l", "ń":"n", "ó":"o", "ś":"s", "ź":"z", "ż":"z"
  };
  let s = "";
  for (let i=0;i<string.length;i++) {
    if (string[i] in d) {
      s += d[string[i]];
    }
    else {
      s += string[i];
    }
  }
  return s;
}
```

## Python
```py
def correct_polish_letters(st):
    d = {
        "ą":"a", "ć":"c", "ę":"e", "ł":"l", "ń":"n", "ó":"o", "ś":"s", "ź":"z", "ż":"z"
    }
    s = ""
    for i in st:
        if i in d:
            s += d[i]
        else:
            s += i
    return s
```